Algoritmo "NumeroPrimo"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023

Var
// Se��o de Declara��es das vari�veis
num,divi,contador:inteiro

inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
contador<-1
divi<-0

escreval("Digite o numero: ")
 leia(num)
 
repita
      se (num % contador = 0) entao
      divi <- divi +1
      fimse

      contador <- contador +1

ate (contador > num)

    se (divi = 2) entao
      escreval("primo")
    senao
      escreval("N�o � primo")
    fimse
fimalgoritmo