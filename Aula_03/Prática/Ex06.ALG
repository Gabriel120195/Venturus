Algoritmo "Ex 06 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Escreva o algoritmo "Programa Solidário". O doador deve clicar nas
//opções (mostradas abaixo) para efetuar a sua doação. Imprima o
//resultado na tela com o valor da doação e uma mensagem de
//agradecimento. Utilize a estrutura Escolha...Caso

Var
// Seção de Declarações das variáveis
valor :inteiro
valorMaior: real
categoria : caractere
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreval("[1] para doar R$10,00 / [2] para doar R$25,00 / [3] para doar R$50,00")
escreval("[4] para doar outros valores / [5] para cancelar")
  leia(valor)

  escolha valor
  caso 1
       escreval("Você fez uma doação de R$ 10,00 / Agradecemos sua contribuição!")
  caso 2
       escreval ("Você fez uma doação de R$ 25,00 / Agradecemos sua contribuição!")
  caso 3
       escreval ("Você fez uma doação de R$ 50,00 / Agradecemos sua contribuição!")
  caso 4
       escreval("Qual valor gostaria de doar?")
         leia(valorMaior)
         
       escreval("Você fez uma doação de R$ ",valorMaior:2:2," / Agradecemos sua contribuição!")

  outrocaso
       escreva("Cancelado")

  fimescolha
  
Fimalgoritmo