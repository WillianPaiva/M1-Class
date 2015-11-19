#include "userthread.h"
#include "system.h"
#include "synch.h"
#include "addrspace.h"

static Lock *thCounter = new Lock("thread Counter");
int do_ThreadCreate(int f, int arg){
    int* temp = new int[2];
    temp[0] = f;
    temp[1] = arg;
    if(currentThread->space->threadBitMap->NumClear() > 0){
      thCounter->Acquire();
      Thread *t = new Thread ("new thread");
      t->threadNumber = currentThread->space->threadBitMap->Find();
      currentThread->space->threadCounter++;
      t->Start(StartUserThread,temp);
      thCounter->Release();
        return 0;
    }else{
        return -1;
    }

}


int do_ThreadExit(){
  thCounter->Acquire();
    if(currentThread->threadNumber >= 0){
        currentThread->space->threadBitMap->Clear(currentThread->threadNumber);
    }
    currentThread->space->threadCounter--;
    thCounter->Release();
    currentThread->Finish();
    return 0;
}

static void StartUserThread(void *schmurtz){
    int *temp = (int*) schmurtz;
    currentThread->space->InitUserRegisters(temp[0],temp[1]);
    delete []schmurtz;
    currentThread->space->RestoreState();
    machine->Run();
}
