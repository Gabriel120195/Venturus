Algoritmo "Ex 06 - Fibonacci_Funcao"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/02/2023

//Faça um algoritmo para exibir os 10
//primeiros elementos de uma série de
//Fibonacci usando função com
//passagem de parâmetros por referência

Var
I, f1, f2, f3: Inteiro
 Funcao fibonacci(var N1, N2: Inteiro): Inteiro

Var
N3: Inteiro

Inicio
N3 <- N1 + N2
N1 <- N2
N2 <- N3
 Retorne N3
FimFuncao

inicio
f1 <- 0
 EscrevaL(f1)
f2 <- 1
 EscrevaL(f2)
 Para I <- 3 ate 5 faca
  f3 <- fibonacci(f1, f2)
   EscrevaL(f3)
 FimPara
fimalgoritmo