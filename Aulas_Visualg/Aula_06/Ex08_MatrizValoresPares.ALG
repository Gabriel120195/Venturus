Algoritmo "MatrizValoresPares"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Seção de Declarações das variáveis 
valores: vetor [1..3,1..3] de inteiro
i,c,totalPar:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   para i <- 1 ate 3 faca
     para c <- 1 ate 3 faca
          escreva("Digite o valor da posição [", i, ",", c,"]: ")
           leia(valores [i,c])
     fimpara
   fimpara
escreval("========================")

totalPar <- 0

para i <- 1 ate 3 faca
 para c <- 1 ate 3 faca
      se (valores [i,c] % 2 = 0) entao
         escreva("{",valores [i, c]:2, "}")
          totalPar <- totalPar+1
      senao
           escreva(valores[i, c]:2)
      fimse
 fimpara
 
 escreval()
 fimpara
 
 escreval("Foram digitados ",totalPar," Numeros pares")

Fimalgoritmo