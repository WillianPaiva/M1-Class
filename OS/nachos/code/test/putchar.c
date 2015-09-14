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

void print(char c, int n)
{
    int i;
#if 0
    for(i = 0; i<m;i++)
    {
        PutChar(c+i);
    }
#endif
}
int main()
{
    print('a',4);
    Halt();
}


