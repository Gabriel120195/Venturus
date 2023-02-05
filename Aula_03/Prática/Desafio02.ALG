Algoritmo "Desafio 02"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Faça um programa que receba as informações de produtos:
//O preço
//A categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário),
//A situação (R – produtos que necessitam de refrigeração; e N – produtos que
//não necessitam de refrigeração).

Var
// Seção de Declarações das variáveis 
preco, aum5, aum8, aum10, aum12, aum15, aum18, vf, desconto, vTotal : real
categoria : inteiro
situacao : caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Valor do Produto: ")
 leia(preco)
escreva("Categoria: 1– limpeza / 2– alimentação / 3– vestuário ")
 leia(categoria)
escreval("Situação: R– Necessita de refrigeração / N– NÃO necessita de refrigeração")
 leia(situacao)
 
aum5 <- ((5 * preco) / 100)
aum8 <- (8 * preco) / 100
aum10 <- (10 * preco) / 100
//========================
aum12 <- ((12 * preco) / 100)
aum15 <- (15 * preco) / 100
aum18 <- (18 * preco) / 100
 

 escolha categoria
 
 caso 1
      se (preco <= 25) entao
         vf <- (aum5 + preco)
      senao
       se (preco > 25) entao
         vf <- (aum12 + preco)
      senao
      fimse
      fimse
 caso 2
      se (preco <= 25) entao
         vf <- (aum8 + preco)
      senao
       se (preco > 25) entao
         vf <- (aum15 + preco)
      senao
      fimse
      fimse
 caso 3
      se (preco <= 25) entao
         vf <- (aum10 + preco)
      senao
       se (preco > 25) entao
         vf <- (aum18 + preco)
      senao
      fimse
      fimse

outrocaso
   escreval("Categoria inválida")


fimescolha

escreval("Valor R$ ",vf:2:2)

se ((categoria = 2) e (situacao = "R")) entao
   desconto <- (8 * vf) / 100
senao
 se ((categoria = 2) ou (situacao = "R")) entao
   desconto <- (5 * vf) / 100
 senao
 
 fimse
 fimse

 escreval("Desconto R$ ",desconto)
 
 vTotal <- vf - desconto
 
 se (vTotal <= 50) entao
    escreva("Total a Pagar R$ ",vTotal:2:2," / Classificação = Barato")
 senao
  se ((vTotal > 50) e (vTotal < 120)) entao
     escreva("Total a Pagar R$ ",vTotal:2:2," / Classificação = Normal")
  senao
       escreva("Total a Pagar R$ ",vTotal:2:2," / Classificação = Caro")

fimse
fimse


Fimalgoritmo