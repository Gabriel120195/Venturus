Algoritmo "Ex 07 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Crie um algoritmo que simule uma calculadora, ou seja, que permite ao usuário escolher a
//operação matemática que ele deseja (soma,subtração, multiplicação e divisão). Após a
//escolha da operação desejada, o resultado deve ser impresso na tela. O usuário deve ler dois
//números para fazer uso da calculadora.

Var
// Seção de Declarações das variáveis
operacao : inteiro
v1, v2, soma, subt, mult, divi : real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("1 - SOMA / 2 - SUBTRAÇÃO / 3 - MULTIPLICAÇÃO / 4 - DIVISÃO")
leia(operacao)

escreva("Primeiro Número: ")
 leia(v1)
escreva("Segundo Número: ")
 leia(v2)

soma <- v1 + v2
subt <- v1 - v2
mult <- v1 * v2
divi <- v1 / v2

escolha operacao
caso 1
     escreva(v1," +",v2," = ",soma)
caso 2
     escreva(v1," -",v2," = ",subt)
caso 3
     escreva(v1," x",v2," = ",mult)
caso 4
     escreva(v1," /",v2," = ",divi)
outrocaso
     escreva("Operação inválida!")

fimescolha

Fimalgoritmo