#ifndef PAGEPROVIDER_H
#define PAGEPROVIDER_H

#include "bitmap.h"
#include "system.h"
#include "copyright.h"

class PageProvider:dontcopythis
{
 public:
  PageProvider();
  ~PageProvider();

// return a free page number
  int GetEmptyPage();

// release a used page
  void ReleasePage(int n);

// return how many free pages is availeble
  int NumAvailPage();

 private:
  BitMap *pageMap;
};

#endif
