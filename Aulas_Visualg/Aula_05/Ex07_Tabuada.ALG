Algoritmo "Tabuada"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Se��o de Declara��es das vari�veis 
n,x,t,i: inteiro

funcao funcaoTab(n1,n2:inteiro):inteiro

Inicio
      t <- i*n
       retorne t
fimfuncao

Inicio
 Escreva("Digite o valor para Tabuada: ")
  leia(n)

   se (n < 1) ou (n > 10) entao
      escreval("Numero inv�lido")
   senao
        para i de 1 ate 10 faca
         x <- funcaoTab(i,n)
          escreval(i, " x", n," =",x)
   fimpara
fimse

Fimalgoritmo