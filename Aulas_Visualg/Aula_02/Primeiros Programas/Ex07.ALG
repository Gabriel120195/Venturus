Algoritmo "Ex 07 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 31/01/2023

//Crie um algoritmo que calcule a área de um trapézio. Imprima o
//resultado na tela
Var
// Seção de Declarações das variáveis
b1, b2, altura, formula :Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Centímetros da Base MENOR do Trapézio: ")
 leia(b1)
escreva("Centímetros da Base MAIOR do Trapézio: ")
 leia(b2)
escreva("Centímetros da ALTURA do Trapézio: ")
 leia(altura)
 
 
formula <- (b2 + b1) * altura / 2

 escreva("Área do Trapézio: ",formula," Cm²")

Fimalgoritmo