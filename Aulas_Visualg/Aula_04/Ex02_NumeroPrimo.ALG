Algoritmo "NumeroPrimo"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023

Var
// Seção de Declarações das variáveis
num,divi,contador:inteiro

inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
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
      escreval("Não é primo")
    fimse
fimalgoritmo