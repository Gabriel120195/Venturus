Algoritmo "Ex 06 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 31/01/2023

//Crie um algoritmo que converta a temperatura Fahrenheit para
//graus Celsius. Imprima o resultado na tela.
Var
// Seção de Declarações das variáveis
f, c, formula :Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Grau Fahrenheit(ºF): ")
 leia(f)

formula <- (f - 32) * 5 / 9

 escreva("Graus Celsius: ",formula:1,"ºC")

Fimalgoritmo