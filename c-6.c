#include <stdio.h>

int sub(int x,int y){
  if(x%y==0)return 1;
  else return 0;
}
int main(void){
  int a=17, b=5;
  printf("%d",sub(a,b));
  return 0;
}
