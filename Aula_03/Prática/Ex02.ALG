Algoritmo "Ex 02 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Escreva um programa que leia um número inteiro. Se o número lido
//for positivo, escreva uma mensagem indicando se ele é par ou ímpar. Se
//o número for negativo, escreva a seguinte mensagem “Este número não
//é positivo”.
Var
   // Seção de Declarações das variáveis
numero : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Digite um número: ")
  leia(numero)

  se (numero < 0) entao
     escreva(numero, " Este número não é positivo")
senao
     se ((numero % 2) = 0) entao
      escreva(numero, " PAR")
senao
      escreva(numero, " IMPAR")
      
fimse
fimse

Fimalgoritmo