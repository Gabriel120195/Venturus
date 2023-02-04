Algoritmo "Ex 05 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 31/01/2023

//Crie um algoritmo que faça a conversão do moeda real para a
//moeda euro. Imprima o resultado na tela.
Var
// Seção de Declarações das variáveis
valorEuro, valorReal, conv :Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Digite a Quantidade de R$: ")
 leia(valorReal)
 
valorEuro <- 0.18
 

 conv <- valorEuro * valorReal

 escreva("Você tem € ",conv)

Fimalgoritmo