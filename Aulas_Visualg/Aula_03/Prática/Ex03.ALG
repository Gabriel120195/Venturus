Algoritmo "Ex 03 - Pr�tica"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Fa�a um algoritmo que receba o valor do sal�rio de uma pessoa e o valor de um
//financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes o
//sal�rio da pessoa, o algoritmo dever� escrever "Financiamento Concedido"; sen�o, ele dever�
//escrever "Financiamento Negado". Independente de conceder ou n�o o
//financiamento, o algoritmo escrever� depois a frase "Obrigado por nos consultar.

Var
   // Se��o de Declara��es das vari�veis
salario, valorFinan : real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Digite seu sal�rio R$ ")
  leia(salario)
escreva("Digite o valor do Financiamento R$ ")
  leia(valorFinan)

  se ((salario * 5) >= valorFinan) entao
     escreval("Financiamento Concedido !")
senao
      escreval("Financiamento Negado !")


fimse

escreval("Obrigado por nos consultar")

Fimalgoritmo