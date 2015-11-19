#include "copyright.h"
#include "system.h"
#include "pageprovider.h"
#include <cstdlib>

PageProvider::PageProvider ()
{
  pageMap = new BitMap(NumPhysPages);
}

PageProvider::~PageProvider(){
  delete pageMap;
}

int
PageProvider::GetEmptyPage(){
  int temp = pageMap->Find();

  // int temp = rand() % NumPhysPages;
  // while(pageMap->Test(temp)){
  //     temp = rand() % NumPhysPages;
  // }
  // pageMap->Mark(temp);


  if(temp != -1){
    memset(&machine->mainMemory[temp*PageSize],0,PageSize);
    return temp;
  }else{
    return -1;
  }
}


int
PageProvider::NumAvailPage(){
  return pageMap->NumClear();
}

void
PageProvider::ReleasePage(int n){
  pageMap->Clear(n);
}
