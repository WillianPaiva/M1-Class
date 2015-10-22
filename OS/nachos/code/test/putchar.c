/*
    for(;;){
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
void printString(char* c)
{
#if 1
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
    char* s = "\n\n\n ------------------------------ thread test-----------------------------------\n\n\n";
    ThreadCreate(printString,s);
    for(;;){}
    return 5;
}


