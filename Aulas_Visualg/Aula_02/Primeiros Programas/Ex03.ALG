Algoritmo "Ex 03 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 31/01/2023

//Crie um algoritmo que lê o valor do raio e calcule a área do círculo
//correspondente.
Var
// Seção de Declarações das variáveis
raio, area :real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Valor do raio: ")
 leia(raio)

 area <- pi * raio^2
           
 escreval("Área do círculo: ", area:1:2," Cm²")

Fimalgoritmo