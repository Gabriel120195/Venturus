Algoritmo "Ex 05 - Fibonacci"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/02/2023

//Fa�a um algoritmo para exibir os 10
//primeiros elementos de uma s�rie de
//Fibonacci usando procedimentos
//com passagem de par�metros por refer�ncia.

var
  I, f1, f2, f3: Inteiro
Procedimento fibonacci(var N1, N2: Inteiro)

Var
N3: Inteiro

Inicio
N3 <- N1 + N2
EscrevaL(N3)
N1 <- N2
N2 <- N3
FimProcedimento

inicio
f1 <- 0
 EscrevaL(f1)
f2 <- 1
 EscrevaL(f2)
Para I <- 3 ate 10 faca
  fibonacci(f1, f2)
FimPara

fimalgoritmo