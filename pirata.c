#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//-std=c99
//Por alguna razon la funcion de imprimir el tablero da error de la libreria, por eso se repito todo el codigo
void gameover(){
  printf("\033[H\033[J");
  printf("Perdiste\n");
}
void gamewin(){
  printf("\033[H\033[J");
  printf("Ganaste\n");
}

int main(void) {
 int contador = 0;
 int juego = 1;
 int pos_y = 1;
 int pos_x = 1;
 int matriz[10][10];
 int length = 10;
 int menu = 1;
 while (menu == 1){
   int eleccion = 0;
   printf("Elija su opcion:\n" );
   printf("(1)Imprimir el tablero\n");
   printf("(2)Jugar\n" );
   printf("(3)Salir\n" );
   scanf("%d",&eleccion);
   switch (eleccion) {
     case 1 :
    system("cls");
     for (int i = 0; i < length; i++) {
       for (int j = 0; j < length; j++) {
         matriz[i][j] = 1;
         if (i == 0 && j == length -1 ||j == 0 && i == length -1 ) matriz[i][j] = 1;
         else if (i == 0 || j == 0) matriz[i][j] = 0;
         else if (i == (length - 1 )|| j == (length - 1)) matriz[i][j] = 0;
         else if (i == pos_y && j == pos_x) matriz[i][j] = 2;
         else if (i == (length - 2) && j == (length - 2)) matriz[i][j] = 3;
         printf("%d ", matriz[i][j]);
       }
       printf("\n");
     }
     printf("\n");
     break;

    case 2:
     menu = 0;
     break;
    case 3:
      menu = 0;
      juego = 0;
      break;
  }
 }
  while (juego == 1) {
        int decicsion  = 0;
    system("cls");
    //zonas "especialies"
    if (pos_x == 0 || pos_y == 0|| contador == 50)
    {gameover();
      break;
      }
    if (pos_x == length - 2 && pos_y == length - 2)
    {gamewin();
      break;}
    //for para imprimir el "tablero"
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        matriz[i][j] = 1;
        if (i == 0 && j == length -1 ||j == 0 && i == length -1 ) matriz[i][j] = 1;
        else if (i == 0 || j == 0) matriz[i][j] = 0;
        else if (i == (length - 1 )|| j == (length - 1)) matriz[i][j] = 0;
        else if (i == pos_y && j == pos_x) matriz[i][j] = 2;
        else if (i == (length - 2) && j == (length - 2)) matriz[i][j] = 3;
        printf("%d ", matriz[i][j]);
      }
      printf("\n");
    }
    printf("\n");
    printf("%Intentos restantes %d \n",(50 - contador) );
    printf("\n");
    printf("%Decida si, moverse hacia arriba (1), hacia abajo (2), hacia la izquierda (3) o la derecha (4)\n");
    scanf("%d",&decicsion );
    switch (decicsion) {
      default: printf("Invalido\n");
       case 1:
       contador ++;
        if (pos_y > 0) pos_y -= 1;
        break;
      case 2:
      contador ++;
        if (pos_y < 9) pos_y += 1;
        break;
      case 3:
      contador ++;

        if (pos_x > 0) pos_x -= 1;
        break;
      case 4:
      contador ++;
        if (pos_x < 9) pos_x += 1;
        break;
}}
 return 0;
}
