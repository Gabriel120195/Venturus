Algoritmo "Ex 05 - Pr�tica"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Suponha que a empresa "Google" decidiu conceder um aumento de sal�rios a seus
//funcion�rios de acordo com a tabela ao lado. Escreva um algoritmo que l�, para cada
//funcion�rio, o seu nome e o seu sal�rio atual. Ap�s receber estes dados, o algoritmo calcula o
//novo sal�rio e escreve na tela as seguintes informa��es:

Var
   // Se��o de Declara��es das vari�veis
salario, opcao1, opcao2, opcao3, opcao4, opcao5 : real
aumento20, aumento15, aumento12, aumento10, aumento7 : real
nome : caractere
salMin : inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Nome do Funcion�rio: ")
  leia(nome)
escreva("Sal�rio do Funcion�rio R$ ")
  leia(salario)


salMin <- 1000

opcao1 <- 3 * salmin //At� 3 salarios
opcao2 <- 6 * salmin //At� 6 salarios
opcao3 <- 9 * salmin //At� 9 salarios
opcao4 <- 12 * salmin //At� 12 salarios
opcao5 <- 15 * salmin //At� 15 salarios

aumento20 <- (salario * 20) / 100
aumento15 <- (salario * 15) / 100
aumento12 <- (salario * 12) / 100
aumento10 <- (salario * 10) / 100
aumento7 <- (salario * 7) / 100


  se (salario <= opcao1) entao
     escreval(nome," Voc� ter� 20% de aumento! / Hoje seu sal�rio � R$ ",salario," / E vai receber R$",(salario + aumento20))
senao
  se ((salario > opcao1) e (salario <= opcao2)) entao
      escreval(nome," Voc� ter� 15% de aumento! / Hoje seu sal�rio � R$ ",salario," / E vai receber R$",(salario + aumento15))
senao
  se ((salario > opcao2) e (salario <= opcao3)) entao
      escreval(nome," Voc� ter� 12% de aumento! / Hoje seu sal�rio � R$ ",salario," / E vai receber R$",(salario + aumento12))
senao
  se ((salario > opcao3) e (salario <= opcao4)) entao
      escreval(nome," Voc� ter� 10% de aumento! / Hoje seu sal�rio � R$ ",salario," / E vai receber R$",(salario + aumento10))
senao
  se ((salario > opcao4) e (salario <= opcao5)) entao
      escreval(nome," Voc� ter� 7% de aumento! / Hoje seu sal�rio � R$ ",salario," / E vai receber R$",(salario + aumento7))

  senao
      escreva(nome" Voc� n�o ter� aumento !")

fimse
fimse
fimse
fimse
fimse

Fimalgoritmo