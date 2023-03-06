Algoritmo "Ex02_50Valores"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 12/02/2023
Var
// Seção de Declarações das variáveis 
i,vMaior,vMenor,vTotal: inteiro
valores : vetor [1..50] de inteiro
media:real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
vMaior <- 1
vMenor <- 1

para i de 1 ate 50 faca
     escreva("Digite o valor: ")
      aleatorio 1,50
      leia(valores[i])
      aleatorio off
      
      se (valores[i] < valores[vMenor]) entao
         vMenor <- i
      senao
      fimse
       se (valores[i] > valores[vMaior]) entao
         vMaior <- i
      fimse

      vTotal <- vTotal + valores[i]

      media <- (vTotal / 50)
fimpara
       escreval("Menor valor = ",valores[vMenor])
       escreval("Maior valor = ",valores[vMaior])
       escreval("Média valores = ",media)
Fimalgoritmo