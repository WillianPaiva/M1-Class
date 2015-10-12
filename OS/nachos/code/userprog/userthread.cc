#include "userthread.h"
#include "system.h"
#include "addrspace.h"

int do_ThreadCreate(int f, int arg){

    int* temp[2] ={&f,&arg};  
    
    Thread *t = new Thread ("new thread");
    t->Start(StartUserThread,temp);
    return 0;
}



//pagesize = 128
static void StartUserThread(void *schmurtz){


    //machine->WriteRegister (StackReg, numPages * PageSize - 16);
    //DEBUG ('a', "Initializing stack register to 0x%x\n",
	   //numPages * PageSize - 16);
}
