#include <stdlib.h>
#include <stdio.h>


int main(int argc, char const *argv[]) {
  int num;
  printf("Inserte el numero\n");
  scanf("%d",&num);
  if (num < 1) {
  printf("Numero Invalido\n");
  return 1;}
  printf("%d ", num);
  while (num > 1) {
    if (num%2 == 0) {
      num = (num / 2);
      printf("%d ",(num));
    }
    else {
      num = (num * 3)  + 1 ;
      printf("%d ",num);
    }
  }
  printf("\n");
  return 0;
}
