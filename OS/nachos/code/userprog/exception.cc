// exception.cc
//      Entry point into the Nachos kernel from user programs.
//      There are two kinds of things that can cause control to
//      transfer back to here from user code:
//
//      syscall -- The user code explicitly requests to call a procedure
//      in the Nachos kernel.  Right now, the only function we support is
//      "Halt".
//
//      exceptions -- The user code does something that the CPU can't handle.
//      For instance, accessing memory that doesn't exist, arithmetic errors,
//      etc.
//
//      Interrupts (which can also cause control to transfer from user
//      code into the Nachos kernel) are handled elsewhere.
//
// For now, this only handles the Halt() system call.
// Everything else core dumps.
//
// Copyright (c) 1992-1993 The Regents of the University of California.
// All rights reserved.  See copyright.h for copyright notice and limitation
// of liability and disclaimer of warranty provisions.

#include "copyright.h"
#include "system.h"
#include "syscall.h"
#include "userthread.h"
#include "process.h"
#include "synch.h"
#define BUFFER_SIZE 8
#define MAXI_SIZE 1000*BUFFER_SIZE
//----------------------------------------------------------------------
// UpdatePC : Increments the Program Counter register in order to resume
// the user program immediately after the "syscall" instruction.
//----------------------------------------------------------------------
int processconter = 0;
static Lock *putstr = new Lock("hold putsring");
static Lock *ForkCounter = new Lock("fork couter");
static int forknumber = 0;
static void
UpdatePC ()
{
  int pc = machine->ReadRegister (PCReg);
  machine->WriteRegister (PrevPCReg, pc);
  pc = machine->ReadRegister (NextPCReg);
  machine->WriteRegister (PCReg, pc);
  pc += 4;
  machine->WriteRegister (NextPCReg, pc);
}

//----------------------------------------------------------------------
// ExceptionHandler
//      Entry point into the Nachos kernel.  Called when a user program
//      is executing, and either does a syscall, or generates an addressing
//      or arithmetic exception.
//
//      For system calls, the following is the calling convention:
//
//      system call code -- r2
//              arg1 -- r4
//              arg2 -- r5
//              arg3 -- r6
//              arg4 -- r7
//
//      The result of the system call, if any, must be put back into r2.
//
// And don't forget to increment the pc before returning. (Or else you'll
// loop making the same system call forever!
//
//      "which" is the kind of exception.  The list of possible exceptions
//      are in machine.h.
//----------------------------------------------------------------------

void
ExceptionHandler (ExceptionType which)
{
  int type = machine->ReadRegister (2);

  switch (which)
    {
    case SyscallException:
      {
        switch (type)
          {
          case SC_Halt:
            {
              DEBUG ('s', "Shutdown, initiated by user program.\n");
              interrupt->Halt ();
              break;
            }
#ifdef CHANGED
          case SC_PutChar:
            {
              DEBUG ('s', "PutChar SysCall.\n");
              synchconsole->SynchPutChar(machine->ReadRegister (4));
              break;
            }
          case SC_GetChar:
            {
              DEBUG('s',"getchar syscall \n");
              int temp = synchconsole->SynchGetChar();
              machine->WriteRegister(2,temp);
              break;
            }
          case SC_GetString:
            {

              DEBUG ('s', "GetString SysCall.\n");
              int arg1 = machine->ReadRegister(4);
              int x = 0;
              bool t = true;
              char temp[BUFFER_SIZE];
              putstr->Acquire();
              while(t){
                synchconsole->SynchGetString(temp,BUFFER_SIZE);
                int y = copyStringToMachine(arg1+(x*sizeof(char)),temp,BUFFER_SIZE);
                x+=BUFFER_SIZE -1;
                if(y == 0 && x<MAXI_SIZE-1){
                  t = true;
                }else{
                  t = false;
                }

              }
              putstr->Release();
              break;
            }
          case SC_PutString:
            {
              DEBUG ('s', "PutString SysCall.%s\n",currentThread->getName());
              char temp[BUFFER_SIZE];
              int x = 0;
              bool t = true;
              putstr->Acquire();
              while(t){
                int y = copyStringFromMachine(machine->ReadRegister(4)+(x*sizeof(char)),temp,BUFFER_SIZE);
                x+=BUFFER_SIZE-1;
                synchconsole->SynchPutString(temp);
                if(y == 0 && x<MAXI_SIZE){
                  t = true;
                }else{
                  t = false;
                }

              }
              putstr->Release();
              break;
            }
            /************************************************************
             *  when the user program finish it launchs a syscall EXIT  *
             ************************************************************/
          case SC_Exit:
            {
              DEBUG('s', "exit return --> %d  --- %d --- %s \n", forknumber,
                    currentThread->space->threadCounter,currentThread->getName());
              if(forknumber == 0 && currentThread->space->threadCounter == 0){
                interrupt->Halt();
              }else if(forknumber == 0){
                currentThread->Finish();
              }else{
                if(currentThread->space->threadCounter == 0){
                  delete currentThread->space;
                }
                ForkCounter->Acquire();
                forknumber--;
                ForkCounter->Release();
                currentThread->Finish();
              }
              break;
            }
          case SC_ThreadCreate:
            {
              int f = machine->ReadRegister(4);
              int arg = machine->ReadRegister(5);
              int temp = do_ThreadCreate(f,arg);
              machine->WriteRegister(2,temp);
              break;

            }
          case SC_ForkExec:
            {
              char temp[128];
              copyStringFromMachine(machine->ReadRegister(4),temp,128);
              ForkCounter->Acquire();
              forknumber++;
              ForkCounter->Release();
              do_ForkExec(temp);
              break;
            }

          case SC_ThreadExit:
            {
              DEBUG('s', "thread exit --> %d  --- %d --- %s \n", forknumber,
                    currentThread->space->threadCounter,currentThread->getName());
              if(forknumber == 0 && currentThread->space->threadCounter == 1){
                interrupt->Halt();
              }else{
                do_ThreadExit();
              }
              break;
            }
#endif
          default:
            {
              printf("Unimplemented system call %d\n", type);
              ASSERT(FALSE);
            }
          }

        // Do not forget to increment the pc before returning!
        UpdatePC ();
        break;
      }

    case PageFaultException:
      if (!type) {
        printf("NULL dereference at PC %x!\n", machine->registers[PCReg]);
        ASSERT (FALSE);
      } else {
        printf ("Page Fault at address %x at PC %x\n", type, machine->registers[PCReg]);
        ASSERT (FALSE);	// For now
      }

    default:
      printf ("Unexpected user mode exception %d %d at PC %x\n", which, type, machine->registers[PCReg]);
      ASSERT (FALSE);
    }
}
