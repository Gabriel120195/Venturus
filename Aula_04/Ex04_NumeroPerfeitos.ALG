Algoritmo "Numeros perfeitos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel R Silva
// Data atual  : 11/02/2023
Var
// Seção de Declarações das variáveis 
i,n,soma: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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
 escreva ("Não é perfeito")
fimse

Fimalgoritmo