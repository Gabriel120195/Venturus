Algoritmo "Ex Desafio - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 03/02/2023

//Escreva um algoritmo que leia tr�s lados quaisquer. Identifique se esses
//lados podem formar um tri�ngulo. Caso os lados formem um tri�ngulo,
//identifique se o tri�ngulo � equil�tero, escaleno ou is�celes.

//Regra: Suponha os lados a, b e c.

//� triangulo somente se a condi��o for satisfeita: (a+b)>c e (a+c)>b e (b+c)>a
//Equil�tero: todos os lados iguais. Escaleno: todos os lados diferentes.
//Is�celes: dois lados s�o iguais
Var
// Se��o de Declara��es das vari�veis
a, b, c:Real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Digite o PRIMEIRO Valor: ")
 leia(a)
escreva("Digite o SEGUNDO Valor: ")
 leia(b)
escreva("Digite o TERCEIRO Valor: ")
 leia(c)

 se((a > (b+c)) ou (b > (a+c)) ou (c > (b+a))) entao
      escreval("N�o � Tri�ngulo")

senao

 se(a = b) e (a = c) entao
      escreval("O tri�ngulo � EQUIL�TEROS")

senao

 se(a = b) ou (a = c) ou (b = c) entao
      escreval("O tri�ngulo � IS�SCELES")

senao
     escreva("O tri�ngulo � ESCALENO")

fimse
fimse
fimse

fimalgoritmo




