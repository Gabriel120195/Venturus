Algoritmo "Ex 04 - Fatorial"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/02/2023

//Escreva o algoritmo, usando fun��o, que
//calcule o fatorial de um n�mero

Var
// Se��o de Declara��es das vari�veis 
F, Fatorial:inteiro
funcao calFatorial(x:inteiro):inteiro

inicio
se x=0 entao
   retorne 1
sen�o
   retorne x*calFatorial(x-1)
fimse
fimfuncao

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("N�mero para calcular fatorial: ")
 Leia(F)
 
   Fatorial <- calFatorial(F)
   Escreva("Fatorial = ", Fatorial)
Fimalgoritmo