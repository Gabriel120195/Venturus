Algoritmo "Numeros perfeitos"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel R Silva
// Data atual  : 11/02/2023
Var
// Se��o de Declara��es das vari�veis 
i,n,soma: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
leia (n)
soma <- 0
para i de 1 ate n-1 faca
 se n%i=0 entao
 soma <- soma + i
 fimse
fimpara
se soma=n entao
 escreva ("Perfeito")
senao
 escreva ("N�o � perfeito")
fimse

Fimalgoritmo