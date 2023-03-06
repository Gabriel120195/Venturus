Algoritmo "Ex 02 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 02/02/2023

//Crie um algoritmo que lê o nome de um aluno, as notas de suas
//três provas. Calcule e exiba a média harmônica das provas com o
//nome do aluno.

Var
// Seção de Declarações das variáveis
p1, p2, p3, mH :Real
nome : caractere


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Nome do aluno: ")
 leia(nome)
escreva("Digite o Valor da PRIMEIRA prova: ")
 leia(p1)
escreva("Digite o Valor da SEGUNDA prova: ")
 leia(p2)
escreva("Digite o Valor da TERCEIRA prova: ")
 leia(p3)

mH <- 3 / (1/p1 + 1/p2 + 1/p3)

escreva("Nome do Aluno: ",nome, " / Média Harmônica: ",mH:2:2)

Fimalgoritmo