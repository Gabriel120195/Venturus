Algoritmo "Ex 06 - Pr�tica"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Escreva o algoritmo "Programa Solid�rio". O doador deve clicar nas
//op��es (mostradas abaixo) para efetuar a sua doa��o. Imprima o
//resultado na tela com o valor da doa��o e uma mensagem de
//agradecimento. Utilize a estrutura Escolha...Caso

Var
// Se��o de Declara��es das vari�veis
valor :inteiro
valorMaior: real
categoria : caractere
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreval("[1] para doar R$10,00 / [2] para doar R$25,00 / [3] para doar R$50,00")
escreval("[4] para doar outros valores / [5] para cancelar")
  leia(valor)

  escolha valor
  caso 1
       escreval("Voc� fez uma doa��o de R$ 10,00 / Agradecemos sua contribui��o!")
  caso 2
       escreval ("Voc� fez uma doa��o de R$ 25,00 / Agradecemos sua contribui��o!")
  caso 3
       escreval ("Voc� fez uma doa��o de R$ 50,00 / Agradecemos sua contribui��o!")
  caso 4
       escreval("Qual valor gostaria de doar?")
         leia(valorMaior)
         
       escreval("Voc� fez uma doa��o de R$ ",valorMaior:2:2," / Agradecemos sua contribui��o!")

  outrocaso
       escreva("Cancelado")

  fimescolha
  
Fimalgoritmo