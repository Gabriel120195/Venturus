Algoritmo "Ex01_Vetor_ordemCrescente"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 20/02/2023

//Crie um algoritmo para ordenar um vetor de
//tamanho 10. Leia todos os valores e depois coloque
//em ordem crescente

var
  v: vetor[1..10] de Inteiro
  c: Inteiro

Procedimento OrdenaVetor()
var
   i, j, aux: Inteiro
inicio
   Para i <- 1 ate 9 faca
      Para j <- i+1 ate 10 faca
         Se (v[i] > v[j]) entao
            aux <- v[i]
            v[i] <- v[j]
            v[j] <- aux
         FimSe
      FimPara
   FimPara
FimProcedimento

inicio
   Para c <- 1 ate 10 faca
      Escreva("Digite o ", c, "o. valor: ")
      Leia(v[c])
   FimPara

   OrdenaVetor()

   EscrevaL("-------------------------------")
   EscrevaL("Vetor Ordenado: ")
   EscrevaL("-------------------------------")
   Para c <- 1 ate 10 faca
      Escreva (v[c], " ")
   FimPara

fimalgoritmo