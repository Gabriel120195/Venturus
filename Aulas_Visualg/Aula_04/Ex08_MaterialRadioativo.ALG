Algoritmo "MaterialRadioativo"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Se��o de Declara��es das vari�veis 
temp: Real
hora: Real
minuto: Real
segundo: Real
massaAtual, massaInicial: Real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
 temp <- 0
   escreval("Digite uma massa inicial: ")
   leia(massaInicial)
   massaAtual <- massaInicial
   enquanto (massaAtual >= 0.5) faca
      massaAtual <- massaAtual/2
      temp <- temp + 50
      escreval("Massa atual eh: ", massaAtual)
   fimenquanto
   hora <- temp/3600
   minuto <- temp/60


   escreval("tempo em segundos: ", tempo, "segundos")
   escreval("horas: ", hora, "hs")
   escreval("minutos: ", minuto, "min")

Fimalgoritmo