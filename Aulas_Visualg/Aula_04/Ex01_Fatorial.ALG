Algoritmo "Fatorial"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Se��o de Declara��es das vari�veis 
i,calculo,fatorial:inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
   repita
    escreva("Digite o valor: ")
     leia(i)


     calculo <- 1
     fatorial <- 1
     
   repita
   
     fatorial <- fatorial * calculo
     calculo <- calculo+1
   
   ate calculo > i
     
     escreval(fatorial)

  ate i < 0

Fimalgoritmo