Algoritmo "Ex 01 - Pr�tica"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Crie um algoritmo que l� um dado n�mero e decida se ele � par ou �mpar.
//Imprima o resultado.
Var
   // Se��o de Declara��es das vari�veis
numero : inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Digite um n�mero: ")
  leia(numero)

  se ((numero % 2) = 0) entao
     escreva(numero, " PAR")
  senao
     escreva(numero, " IMPAR")

fimse


Fimalgoritmo