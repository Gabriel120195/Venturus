Algoritmo "Ex 09 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 02/02/2023

//Crie um algoritmo que l� tr�s valores a, b e c. Indique se a=b, a>b,
//a>=b, c<b, c<>b. Imprima o resultado na tela.
Var
// Se��o de Declara��es das vari�veis
a, b, c :Real


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Digite o PRIMEIRO Valor: ")
 leia(a)
escreva("Digite o SEGUNDO Valor: ")
 leia(b)
escreva("Digite o TERCEIRO Valor: ")
 leia(c)
 
 se (a = b) entao
    escreval("A =",a ," � IGUAL B =",b)
 senao
      se (a >= b) entao
         escreval("A =",a ," � MAIOR que B =",b)
      senao
         escreval("B =",b ," � MAIOR que A =",a)
      fimse
fimse

 se (c < b) e (c <> b) entao
    escreval("B =",b ," � MAIOR e por tanto DIFERENTE de c =",c)
 senao
     se (c > b) e (c <> b) entao
        escreval("C =",c ," � MAIOR e por tanto DIFERENTE de B =",b)
     senao
        escreva("C =",c ," � IGUAL B =",b)
     fimse
fimse

Fimalgoritmo
