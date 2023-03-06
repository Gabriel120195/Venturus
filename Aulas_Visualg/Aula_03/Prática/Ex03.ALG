Algoritmo "Ex 03 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um
//financiamento pretendido. Caso o financiamento seja menor ou igual a 5 vezes o
//salário da pessoa, o algoritmo deverá escrever "Financiamento Concedido"; senão, ele deverá
//escrever "Financiamento Negado". Independente de conceder ou não o
//financiamento, o algoritmo escreverá depois a frase "Obrigado por nos consultar.

Var
   // Seção de Declarações das variáveis
salario, valorFinan : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Digite seu salário R$ ")
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