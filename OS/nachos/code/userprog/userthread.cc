#include "userthread.h"
#include "system.h"
#include "addrspace.h"

int do_ThreadCreate(int f, int arg){
    printf("%d ------- %d\n",f,arg);
    int* temp = new int[2];
    temp[0] = f;
    temp[1] = arg;
    
    Thread *t = new Thread ("new thread");
    t->Start(StartUserThread,temp);
    return 0;
}


int do_ThreadExit(){
    printf("\nexit thread\n");
    currentThread->Finish();
}

static void StartUserThread(void *schmurtz){
    int *temp = (int*) schmurtz;
    printf("%d ------- %d\n",temp[0],temp[1]);
    currentThread->space->InitUserRegisters(temp[0],temp[1] );
    delete schmurtz;
    currentThread->space->RestoreState();
    machine->Run();
}
