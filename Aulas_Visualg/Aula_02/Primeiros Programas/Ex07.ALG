Algoritmo "Ex 07 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 31/01/2023

//Crie um algoritmo que calcule a �rea de um trap�zio. Imprima o
//resultado na tela
Var
// Se��o de Declara��es das vari�veis
b1, b2, altura, formula :Real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Cent�metros da Base MENOR do Trap�zio: ")
 leia(b1)
escreva("Cent�metros da Base MAIOR do Trap�zio: ")
 leia(b2)
escreva("Cent�metros da ALTURA do Trap�zio: ")
 leia(altura)
 
 
formula <- (b2 + b1) * altura / 2

 escreva("�rea do Trap�zio: ",formula," Cm�")

Fimalgoritmo