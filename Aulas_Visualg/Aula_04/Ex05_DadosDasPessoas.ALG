Algoritmo "DadosDasPessoas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Seção de Declarações das variáveis 
nome,sexo,pessoaMaisAlta : caractere
altura,peso,i,pesoTotal : real
sexoTotalHomem,sexoTotalMulher: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
i <- 1
altura <- 0
sexoTotalHomem <- 0
sexoTotalMulher <- 0
pesoTotal <- 0

repita
      escreva("Nome: ")
       leia(nome)
      escreva("Altura: ")
       leia(altura)
      escreva("Peso: ")
       leia(peso)
      escreva("Sexo: ")
       leia(sexo)
       
       se (altura > altura) entao
        pessoaMaisAlta <- nome
       senao
       fimse
       
       se (sexo = "m") entao
        sexoTotalHomem <- sexoTotalHomem+1
       senao
        sexoTotalMulher <- sexoTotalMulher+1
       fimse
       
 pesoTotal <- pesoTotal + peso
       
i <- i+1

ate i > 5

       escreval("Homem = ",sexoTotalHomem)
       escreval("Mulher = ",sexoTotalMulher)
       escreval("pesoTotal = ",pesoTotal)
       escreval("Pessoa mais alta = ",pessoaMaisAlta)

Fimalgoritmo