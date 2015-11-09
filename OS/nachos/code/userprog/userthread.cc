#include "userthread.h"
#include "system.h"
#include "addrspace.h"

int do_ThreadCreate(int f, int arg){
    int* temp = new int[2];
    temp[0] = f;
    temp[1] = arg;
    currentThread->space->threadBitMap->Print();
    if(currentThread->space->threadBitMap->NumClear() > 0){
        Thread *t = new Thread ("new thread");
        t->threadNumber = currentThread->space->threadBitMap->Find();
        currentThread->space->threadCounter++;
        t->Start(StartUserThread,temp);
        return 0;
    }else{
        return -1;
    }

}


int do_ThreadExit(){
    printf("\nexit thread -------> %d---%d \n",currentThread->threadNumber,currentThread->space->threadCounter);
    if(currentThread->threadNumber >= 0){
        currentThread->space->threadBitMap->Clear(currentThread->threadNumber);
    }
    currentThread->space->threadCounter--;
    currentThread->Finish();
}

static void StartUserThread(void *schmurtz){
    int *temp = (int*) schmurtz;
    currentThread->space->InitUserRegisters(temp[0],temp[1]);
    delete []schmurtz;
    currentThread->space->RestoreState();
    machine->Run();
}
 
