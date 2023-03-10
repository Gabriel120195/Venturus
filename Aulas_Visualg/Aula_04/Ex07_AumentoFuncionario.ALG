Algoritmo "AumentoFuncionario"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Seção de Declarações das variáveis 
i, ano_atual : inteiro
salario, novo_salario, percentual : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("digite o ano: ")
   leia(ano_atual)
   escreval("digite o valor do salario: ")
   leia(salario)

   percentual <- (1.5/100)
   novo_salario <- salario + percentual*salario
para i <- 2012 até ano_atual faça
      percentual <- 2*percentual
      novo_salario <- novo_salario + percentual*novo_salario
      i <- i+1
fimpara
   escreval("novo salario: ", novo_salario)

Fimalgoritmo