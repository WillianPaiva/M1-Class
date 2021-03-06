#ifdef CHANGED
#include "copyright.h"
#include "system.h"
#include "synchconsole.h"
#include "synch.h"
static Semaphore *readAvail;
static Semaphore *writeDone;
Lock *lock;

static void ReadAvailHandler(void *arg) { (void) arg; readAvail->V();  }
static void WriteDoneHandler(void *arg) { (void) arg; writeDone->V();  }
SynchConsole::SynchConsole(const char *in, const char *out)
{
    lock = new Lock("Synch console lock");
    readAvail = new Semaphore("read avail", 0);
    writeDone = new Semaphore("write done", 0);

    console = new Console(in, out, ReadAvailHandler, WriteDoneHandler, 0);

}
SynchConsole::~SynchConsole()
{
    delete console;
    delete writeDone;
    delete readAvail;

}
void SynchConsole::SynchPutChar(int ch)
{

    console->PutChar(ch);
    writeDone->P();
}
int SynchConsole::SynchGetChar()
{
    readAvail->P();
    return console->GetChar();
}
void SynchConsole::SynchPutString(const char s[])
{
    lock->Acquire();
    for (int i = 0; s[i] != '\0'; ++i) {
        console->PutChar(s[i]);
        writeDone->P();
    }
    lock->Release();

}
void SynchConsole::SynchGetString(char *s, int n)
{
    lock->Acquire();
    for(int i = 0;i<n;i++){
      readAvail->P();
      s[i]=console->GetChar();
      if(s[i] == EOF || s[i]=='\0' || s[i] == '\n'){
          break;
      }
    }
    lock->Release();
}
#endif // CHANGED
