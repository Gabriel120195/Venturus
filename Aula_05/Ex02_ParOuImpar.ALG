Algoritmo "Ex02_ParOuImpar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
valor,parOuImpar : inteiro
resultado : caractere
procedimento parOuImpar (i:inteiro)

Inicio

      se (i % 2 = 0) entao
       resultado <- "Par"
      senao
       resultado <- "Impar"
      fimse
      
       fimprocedimento
       
Inicio

      escreva("Digite o Número: ")
       leia(valor)
       
       parOuImpar(valor)
       
       
       escreva(valor," = ",resultado)

Fimalgoritmo