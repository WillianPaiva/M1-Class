#include "syscall.h"

void printString(char* c){
  PutString(c);
}





int main()
{
  char* str = "test of the pages ";
  printString(str);
  return 0;
}
