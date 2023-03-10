Algoritmo "Ex03_Maior_e_Menor"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atujl  : 15/02/2023

//Faça um programa que leia um conjunto de
//dados contendo a altura e
//o sexo (masculino, feminino) de 5
//pessoas. Calcule a maior e a menor
//altura do grupo; Calcule a média de
//altura das mulheres e a média de
//altura dos homens. Imprima o resultado

var
   cont, soma, nhomens, nmulher, i: inteiro
   altura: vetor[1..5] de real
   sexo: vetor[1..5] de caractere
   alturaM, alturaH, mediaM, mediaH, maior, menor: real

inicio
   cont<- 1
   menor <- 10
   nhomens<- 0
   nmulher<- 0
   alturaM <- 0
   alturaH <- 0
   escreval("Digite a altura e o sexo de 5 pessoas: ")
   Repita
      escreva("Altura: ")
      leia(altura[cont])
      escreva("Sexo: ")
      leia(sexo[cont])
      escreval("-------------------------------------")
      se(altura[cont]>maior)entao
         maior<- altura[cont]
      fimse
      se(altura[cont]<menor)entao
         menor<- altura[cont]
      fimse
      se(sexo[cont] = "m")entao
         nhomens<- nhomens + 1
         alturaH <- alturaH + altura[cont]
      senao
         nmulher<- nmulher + 1
         alturaM <- alturaM + altura[cont]
      fimse
      cont<- cont + 1
   ate cont > 5
   mediaM <- alturaM/nmulher
   mediaH <- alturaH/nhomens
   escreval("O menor valor é: ", menor)
   escreval("O maior valor é: ", maior)
   escreval("A media da altura dos homens é: ", mediaH)
   escreval("A media da altura das mulheres é: ", mediaM)
fimalgoritmo