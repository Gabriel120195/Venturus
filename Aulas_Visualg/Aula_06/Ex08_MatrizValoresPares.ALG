Algoritmo "MatrizValoresPares"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Se��o de Declara��es das vari�veis 
valores: vetor [1..3,1..3] de inteiro
i,c,totalPar:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
   para i <- 1 ate 3 faca
     para c <- 1 ate 3 faca
          escreva("Digite o valor da posi��o [", i, ",", c,"]: ")
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