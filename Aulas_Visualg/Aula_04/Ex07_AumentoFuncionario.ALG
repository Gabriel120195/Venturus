Algoritmo "AumentoFuncionario"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Se��o de Declara��es das vari�veis 
i, ano_atual : inteiro
salario, novo_salario, percentual : real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("digite o ano: ")
   leia(ano_atual)
   escreval("digite o valor do salario: ")
   leia(salario)

   percentual <- (1.5/100)
   novo_salario <- salario + percentual*salario
para i <- 2012 at� ano_atual fa�a
      percentual <- 2*percentual
      novo_salario <- novo_salario + percentual*novo_salario
      i <- i+1
fimpara
   escreval("novo salario: ", novo_salario)

Fimalgoritmo