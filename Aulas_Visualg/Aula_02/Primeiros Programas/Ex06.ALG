Algoritmo "Ex 06 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 31/01/2023

//Crie um algoritmo que converta a temperatura Fahrenheit para
//graus Celsius. Imprima o resultado na tela.
Var
// Se��o de Declara��es das vari�veis
f, c, formula :Real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Grau Fahrenheit(�F): ")
 leia(f)

formula <- (f - 32) * 5 / 9

 escreva("Graus Celsius: ",formula:1,"�C")

Fimalgoritmo