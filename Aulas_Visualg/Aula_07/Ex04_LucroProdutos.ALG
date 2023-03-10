Algoritmo "Ex04_Lucro_Produtos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 15/02/2023

//Imagine que você tenha um comércio local e esteja totalmente perdido sobre as
//contas do negócio. Sendo assim resolve fazer um programa que realiza o
//levantamento sobre os produtos. Para isto, escreve um programa que lê cada
//mercadoria com o nome, preço de compra e preço de venda. Tendo em mãos o
//código, determine e escreva quantas mercadorias proporcionam:
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
      escreva("Preço de compra: ")
      leia(precompra)
      escreva("Preço de venda: ")
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
   escreval("Nº de produtos com 10% de lucro: ",menorl)
   escreval("Nº de produtos entre 10% e 20% de lucro: ",mediol)
   escreval("Nº de produtos com mais de 20% de lucro: ",maiorl)
   escreval("O valor total de compra é: ",totalc)
   escreval("O valor total de venda é: ",totalv)
   escreval("O Lucro geral é: ",lucrog)
fimalgoritmo