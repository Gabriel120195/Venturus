Algoritmo "Fatorial"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Seção de Declarações das variáveis 
i,calculo,fatorial:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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