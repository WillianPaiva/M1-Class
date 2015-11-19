#include "process.h"
#include "system.h"
#include "console.h"
#include "addrspace.h"
#include "synch.h"

int do_ForkExec(char *s){
  OpenFile *executable = fileSystem->Open (s);
  AddrSpace *space;

  if (executable == NULL)
    {
      printf ("Unable to open file %s\n", s);
      return -1;
    }
  space = new AddrSpace (executable);
  delete executable;		// close file

  Thread *child = new Thread("child");
  child->space = space;
  child->Start(threadStart,(void *) 1);
  return 1;
}

void threadStart(void *s){
  currentThread->space->InitRegisters ();	// set the initial register values
  currentThread->space->RestoreState ();	// load page table register
  machine->Run ();		// jump to the user progam
}
