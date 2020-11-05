/* Bibliotecas */
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

/* Definicoes */
#define nPontos 64        //! Quantidade de valores a serem calculados
#define Resolucao 4095/2  //! Corresponde a amplitude da senoide considerando que ela possui um nivel DC, uma vez que sera utilizada no DAC do ARM e este não permite valores negativos
#define pi 3.14

int main()
{
  float ValorSenoide[nPontos];          //! Declara o vetor que armazena os valores de y = senx
  float DominioFuncao[nPontos];
  FILE *p = fopen("senoide.txt", "wt"); //! Declara um ponteiro e abre um arquivo de texto para ser escrito

  fprintf(p,"ValorSenoide[nPontos] = {\n"); //! Escreve no arquivo de texto
  for(int k = 0; k < nPontos; k++)
  {
     // DominioFuncao[k] = (2*pi*k/(nPontos));
      ValorSenoide[k] = sin(2*pi*k/(nPontos)) + 1; //! Calcula n valores para função seno
      printf("%f,\n", ValorSenoide[k]);            //! Exibe o valor calculado

     /* if(k%8 == 0)
        fprintf(p, "\n");*/

      if(k < (nPontos -1))                   //! Se não for o ultimo valor do vetor
        fprintf(p, "%f,\n",ValorSenoide[k]); //! escreve seguido de virgula no arquivo
      else
        fprintf(p, "%f\n",ValorSenoide[k]);  //! Senao, escreve sem virgula mesmo
  }
  fprintf(p, "};"); //! Escreve no arquivo

  fclose(p);        //! fecha o arquivo

}
