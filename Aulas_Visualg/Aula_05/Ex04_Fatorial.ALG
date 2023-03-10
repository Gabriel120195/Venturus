Algoritmo "Ex 04 - Fatorial"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/02/2023

//Escreva o algoritmo, usando função, que
//calcule o fatorial de um número

Var
// Seção de Declarações das variáveis 
F, Fatorial:inteiro
funcao calFatorial(x:inteiro):inteiro

inicio
se x=0 entao
   retorne 1
senão
   retorne x*calFatorial(x-1)
fimse
fimfuncao

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Número para calcular fatorial: ")
 Leia(F)
 
   Fatorial <- calFatorial(F)
   Escreva("Fatorial = ", Fatorial)
Fimalgoritmo