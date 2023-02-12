Algoritmo "Ex02_50Valores"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 12/02/2023
Var
// Seção de Declarações das variáveis 
i,vMaior,vMenor,vTotal: inteiro
valores : vetor [0..9] de inteiro
media:real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
para i de 0 ate 9 faca
     escreva("Digite o valor: ")
      leia(valores[i])
      
      se (valores[i] < valores[vMenor]) entao
         vMenor <- i
      senao
      fimse
       se (valores[i] > valores[vMaior]) entao
         vMaior <- i
      fimse

      vTotal <- vTotal + valores[i]

      media <- (vTotal / 10)
fimpara
       escreval("Menor valor = ",valores[vMenor])
       escreval("Maior valor = ",valores[vMaior])
       escreval("Média valores = ",media)
Fimalgoritmo