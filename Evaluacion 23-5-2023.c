#include <stdlib.h>
#include <stdio.h>
#include <time.h>

void pozowin(char* sujeto, char* sujeto2) {
	system("cls");
  printf("La %s ha caido en un pozo Demasiadas veces!\n",sujeto2 );
  printf("Felicidades! gano la %s.\n",sujeto );
}
void gamewin(char* sujeto) {
	system("cls");
  printf("La %s ha cruzado la meta! Felicidades\n",sujeto );
}

int dado_tortuga(){
  return ((rand() % 6) + 1);
}
int dado_liebre(){
  return (((rand() % 6) + 1) * 2 );
}

 int main(void) {
	srand(time(NULL));
  int juego = 1;
  int length= 15;
  int tablero[length][length];
  int cant_pozos = 2;
  int cant_com = 2;
  int pozox [cant_pozos];
  int pozoy [cant_pozos];
  int comx [cant_com];
  int comy [cant_com];
  char temp;
  int tortugaY = 0;
  int tortugaX = 0;
  int liebreY = 0;
  int liebreX = 0;
  int caidasl = 0;
  int caidast = 0;
  int Tirada_liebre = 0;
  int Tirada_tortuga = 0;
  //generacion de pozos
  for (int i = 0; i < cant_pozos; i++) {
    pozox[i] = rand() %15;
    pozoy[i] = rand() %15;
  }
  //generacion de comodines
  for (int i = 0; i < cant_com; i++) {
    comx[i] = rand() %15;
    comy[i] = rand() %15;
  }
  while (juego == 1) {
    if (caidasl >= 3)pozowin("Tortuga","Liebre");
    if (caidast >= 3)pozowin("Liebre","Tortuga");
    system("cls");
    //imrpmir tablero
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        temp = 'X';
        if (i == 14 && j == 14) temp = 'M';
        if (i == liebreY && j == liebreX) temp = 'L';
        else if (i == tortugaY && j == tortugaX) temp = 'T';
        //Imprimir pozo
        for (int k = 0; k < cant_pozos; k++) {
          if (i == pozoy[k] && j == pozox[k]) temp = 'O';
        }
        //Imprimir comodin
        for (int k = 0; k < cant_pozos; k++) {
          if (i == comy[k] && j == comx[k]) temp = 'C';
        }
        //En caso de que los equipos compartan casilla imprime un *
        if (i == liebreY && j == liebreX && i == tortugaY && j == tortugaX) temp = '*';
        printf("%c",temp );
        // se imprime la meta
      }
      printf("\n");
    }

    //el jugador decide si quiere jugar o no
    int decision = 3;
    printf("Quiere tirar los dados?(Escriba 1 o 2)\n");
    printf("1) Si\n");
    printf("2) No y cerrar el juego\n");
    scanf("%d",&decision );
    switch (decision) {
      default:
        printf("Seleccion invalida\n");
      case 1:
        printf("bien\n");
        Tirada_liebre = dado_liebre();
        liebreX += Tirada_liebre;
         if (liebreX >=15) {
          liebreX = liebreX - 15;
          liebreY += 1;
        }
        Tirada_tortuga = dado_tortuga();
        tortugaX += Tirada_tortuga;
        if (tortugaX >=15) {
          tortugaX = tortugaX - 15;
          tortugaY += 1;
        }

        break;
      case 2:
        juego = 0;
    }
    // se verifica si cayo en un pozo
    for (int k = 0; k < cant_pozos; k++) {
      if (tortugaX == pozox[k] && tortugaY == pozoy[k]) caidast++;
      if (liebreX == pozox[k] && liebreY == pozoy[k]) caidasl++;
    }
    //se verifica si cayo en un comodin
    for (int k = 0; k < cant_com; k++) {
      if (tortugaX == pozox[k] && tortugaY == pozoy[k]) {pozowin("Liebre", "Tortuga");
        tortugaX += Tirada_tortuga;
          if (tortugaX >=15) tortugaX = tortugaX - 15;
          tortugaY += 1;
      }
      if (liebreX == pozox[k] && liebreY == pozoy[k]) {pozowin("Totuga", "Liebre");
      liebreX + 1;
        if (liebreX >=15) liebreX = liebreX - 15;
        liebreY += 1;
      }
    }
    // se verifica si llego a la meta
    if (liebreX >= 14 && liebreY >= 14){gamewin("Liebte");
    juego = 0;}
    if (tortugaX >= 14 && tortugaY >= 14){gamewin("Tortuga");
    juego = 0;
    }
  }

  return 0;
}
