Algoritmo "Ex 02 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 02/02/2023

//Crie um algoritmo que l� o nome de um aluno, as notas de suas
//tr�s provas. Calcule e exiba a m�dia harm�nica das provas com o
//nome do aluno.

Var
// Se��o de Declara��es das vari�veis
p1, p2, p3, mH :Real
nome : caractere


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Nome do aluno: ")
 leia(nome)
escreva("Digite o Valor da PRIMEIRA prova: ")
 leia(p1)
escreva("Digite o Valor da SEGUNDA prova: ")
 leia(p2)
escreva("Digite o Valor da TERCEIRA prova: ")
 leia(p3)

mH <- 3 / (1/p1 + 1/p2 + 1/p3)

escreva("Nome do Aluno: ",nome, " / M�dia Harm�nica: ",mH:2:2)

Fimalgoritmo