Algoritmo "Ex04_Lucro_Produtos"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 15/02/2023

//Imagine que voc� tenha um com�rcio local e esteja totalmente perdido sobre as
//contas do neg�cio. Sendo assim resolve fazer um programa que realiza o
//levantamento sobre os produtos. Para isto, escreve um programa que l� cada
//mercadoria com o nome, pre�o de compra e pre�o de venda. Tendo em m�os o
//c�digo, determine e escreva quantas mercadorias proporcionam:
// Lucro menor 10 %;
// Lucro entre 10% e 20%;
// Lucro maior que 20%.
// O valor total de compra e de venda de todas as mercadorias.
// O lucro total

var
   nome, x: caractere
   precompra, prevenda, lucro, menorl:real
   mediol, maiorl, totalc, totalv, lucrog: real
inicio
   repita
      escreva("Produto: ")
      leia(nome)
      escreva("Pre�o de compra: ")
      leia(precompra)
      escreva("Pre�o de venda: ")
      leia(prevenda)
      escreva("Cadastrar outro produto,(s/n)?: ")
      leia(x)
      escreval("-------------------- x xx ---------------------")
      totalc<- totalc + precompra
      totalv<- totalv + prevenda
      lucro<- prevenda - precompra
      lucrog<- lucrog + lucro
      se (lucro <precompra * 0.1) entao
         menorl<- menorl + 1
      senao
         se(lucro >= precompra * 0.1) e (lucro <= precompra * 0.2) entao
            mediol<- mediol + 1
         senao
            se(lucro >precompra * 0.2) entao
               maiorl<- maiorl + 1
            fimse
         fimse
      fimse
   ate x = "n"
   escreval("N� de produtos com 10% de lucro: ",menorl)
   escreval("N� de produtos entre 10% e 20% de lucro: ",mediol)
   escreval("N� de produtos com mais de 20% de lucro: ",maiorl)
   escreval("O valor total de compra �: ",totalc)
   escreval("O valor total de venda �: ",totalv)
   escreval("O Lucro geral �: ",lucrog)
fimalgoritmo