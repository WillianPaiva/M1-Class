/*
 * =====================================================================================
 *
 *       Filename:  putchar.c
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  14/09/2015 10:26:16
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  Willian Ver Valem (), vervalenpaiva@gmail.com
 *   Organization:  
 *
 * =====================================================================================
 */

#include "syscall.h"

int counter = 0;

void print(char c, int n)
{
    int i;
#if 1
    for(i = 0; i<n;i++)
    {
        PutChar(c+i);
    }
#endif
}
void printString(char* c, int x)
{
#if 1
    c[6]=48 + counter++;
    PutString(c);
    ThreadExit();
#endif
}
char getchar()
{
#if 1
#endif
    GetChar();
}
char getstring(char *x)
{
#if 1
    GetString(x);
#endif
}
int main()
{

    char* stt = "\n\n\nth=0\n\n\n";
    char* mai = "\n\n\nmain\n\n\n";
    int x;
    for(x=0;x<4;x++){
        ThreadCreate(printString,stt);
    }
    PutString(mai);
    for(x=0;x<100;x++){}
    for(x=0;x<4;x++){
        ThreadCreate(printString,stt);
    } 
    return 0;
}


