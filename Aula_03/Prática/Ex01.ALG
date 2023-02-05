Algoritmo "Ex 01 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Crie um algoritmo que lê um dado número e decida se ele é par ou ímpar.
//Imprima o resultado.
Var
   // Seção de Declarações das variáveis
numero : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Digite um número: ")
  leia(numero)

  se ((numero % 2) = 0) entao
     escreva(numero, " PAR")
  senao
     escreva(numero, " IMPAR")

fimse


Fimalgoritmo