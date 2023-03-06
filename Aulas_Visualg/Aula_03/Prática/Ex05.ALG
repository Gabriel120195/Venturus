Algoritmo "Ex 05 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Suponha que a empresa "Google" decidiu conceder um aumento de salários a seus
//funcionários de acordo com a tabela ao lado. Escreva um algoritmo que lê, para cada
//funcionário, o seu nome e o seu salário atual. Após receber estes dados, o algoritmo calcula o
//novo salário e escreve na tela as seguintes informações:

Var
   // Seção de Declarações das variáveis
salario, opcao1, opcao2, opcao3, opcao4, opcao5 : real
aumento20, aumento15, aumento12, aumento10, aumento7 : real
nome : caractere
salMin : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Nome do Funcionário: ")
  leia(nome)
escreva("Salário do Funcionário R$ ")
  leia(salario)


salMin <- 1000

opcao1 <- 3 * salmin //Até 3 salarios
opcao2 <- 6 * salmin //Até 6 salarios
opcao3 <- 9 * salmin //Até 9 salarios
opcao4 <- 12 * salmin //Até 12 salarios
opcao5 <- 15 * salmin //Até 15 salarios

aumento20 <- (salario * 20) / 100
aumento15 <- (salario * 15) / 100
aumento12 <- (salario * 12) / 100
aumento10 <- (salario * 10) / 100
aumento7 <- (salario * 7) / 100


  se (salario <= opcao1) entao
     escreval(nome," Você terá 20% de aumento! / Hoje seu salário é R$ ",salario," / E vai receber R$",(salario + aumento20))
senao
  se ((salario > opcao1) e (salario <= opcao2)) entao
      escreval(nome," Você terá 15% de aumento! / Hoje seu salário é R$ ",salario," / E vai receber R$",(salario + aumento15))
senao
  se ((salario > opcao2) e (salario <= opcao3)) entao
      escreval(nome," Você terá 12% de aumento! / Hoje seu salário é R$ ",salario," / E vai receber R$",(salario + aumento12))
senao
  se ((salario > opcao3) e (salario <= opcao4)) entao
      escreval(nome," Você terá 10% de aumento! / Hoje seu salário é R$ ",salario," / E vai receber R$",(salario + aumento10))
senao
  se ((salario > opcao4) e (salario <= opcao5)) entao
      escreval(nome," Você terá 7% de aumento! / Hoje seu salário é R$ ",salario," / E vai receber R$",(salario + aumento7))

  senao
      escreva(nome" Você não terá aumento !")

fimse
fimse
fimse
fimse
fimse

Fimalgoritmo