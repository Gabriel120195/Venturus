Algoritmo "Ex 02 - Pr�tica"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Escreva um programa que leia um n�mero inteiro. Se o n�mero lido
//for positivo, escreva uma mensagem indicando se ele � par ou �mpar. Se
//o n�mero for negativo, escreva a seguinte mensagem �Este n�mero n�o
//� positivo�.
Var
   // Se��o de Declara��es das vari�veis
numero : inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Digite um n�mero: ")
  leia(numero)

  se (numero < 0) entao
     escreva(numero, " Este n�mero n�o � positivo")
senao
     se ((numero % 2) = 0) entao
      escreva(numero, " PAR")
senao
      escreva(numero, " IMPAR")
      
fimse
fimse

Fimalgoritmo