Algoritmo "Ex 07 - Pr�tica"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Crie um algoritmo que simule uma calculadora, ou seja, que permite ao usu�rio escolher a
//opera��o matem�tica que ele deseja (soma,subtra��o, multiplica��o e divis�o). Ap�s a
//escolha da opera��o desejada, o resultado deve ser impresso na tela. O usu�rio deve ler dois
//n�meros para fazer uso da calculadora.

Var
// Se��o de Declara��es das vari�veis
operacao : inteiro
v1, v2, soma, subt, mult, divi : real


Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("1 - SOMA / 2 - SUBTRA��O / 3 - MULTIPLICA��O / 4 - DIVIS�O")
leia(operacao)

escreva("Primeiro N�mero: ")
 leia(v1)
escreva("Segundo N�mero: ")
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
     escreva("Opera��o inv�lida!")

fimescolha

Fimalgoritmo