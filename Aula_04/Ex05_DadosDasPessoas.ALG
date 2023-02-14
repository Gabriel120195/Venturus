Algoritmo "DadosDasPessoas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Seção de Declarações das variáveis 
nome,sexo : caractere
alt,peso,i : real
sexoTotalHomem,sexoTotalMulher: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
i <- 1
sexoTotalHomem <- 0
sexoTotalMulher <- 0
repita
      escreva("Nome: ")
       leia(nome)
      escreva("Altura: ")
       leia(alt)
      escreva("Peso: ")
       leia(peso)
      escreva("Sexo: ")
       leia(sexo)
       
       se (sexo = "m") entao
        sexoTotalHomem <- sexoTotalHomem+1
       senao
        sexoTotalMulher <- sexoTotalMulher+1
       fimse
i <- i+1

ate i > 2

       escreval("Homem = ",sexoTotalHomem)
       escreval("Mulher = ",sexoTotalMulher)

Fimalgoritmo