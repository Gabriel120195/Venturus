Algoritmo "Ex07_Matriz4Ordem"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
// Se��o de Declara��es das vari�veis 
valMatriz: vetor [1..4,1..4] de inteiro
l,c :inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
para l <- 1 ate 4 faca
     para c <- 1 ate 4 faca
          escreva("Digite o valor da posi��o [", l, ",", c,"]: ")
           aleatorio 0,50
           leia(valMatriz [l,c])
           aleatorio off
     fimpara
fimpara

escreval()
escreval("===========================")

para l <- 1 ate 1 faca
 para c <- 1 ate 1 faca
       escreval("Diagonal Principa: ")
       escreval(valMatriz[1, 1]:1)
       escreval(valMatriz[2, 2]:4)
       escreval(valMatriz[3, 3]:7)
       escreval(valMatriz[4, 4]:10)

       escreval("===================")
       escreval("Tri�ngulo Superior: ")
       escreval(valMatriz[1, 1],valMatriz[1, 2],valMatriz[1, 3],valMatriz[1, 4])
       escreval(valMatriz[2, 2],valMatriz[2, 3],valMatriz[2, 4])
       escreval(valMatriz[3, 3],valMatriz[3, 4])
       escreval(valMatriz[4, 4])

       escreval("===================")
       escreval("Tri�ngulo Inferior: ")
       escreval(valMatriz[1, 4])
       escreval(valMatriz[2, 3],valMatriz[3, 3],valMatriz[4, 3])
       escreval(valMatriz[3, 3],valMatriz[3, 4])
       escreval(valMatriz[1, 4],valMatriz[2, 4],valMatriz[3, 4],valMatriz[4, 4])

       escreval("===================")
       escreval("Matriz")
       escreval(valMatriz[1, 1],valMatriz[2, 1],valMatriz[3, 1],valMatriz[4, 1])
       escreval(valMatriz[1, 2],valMatriz[2, 2],valMatriz[3, 2],valMatriz[4, 2])
       escreval(valMatriz[1, 3],valMatriz[2, 3],valMatriz[3, 3],valMatriz[4, 3])
       escreval(valMatriz[1, 4],valMatriz[2, 4],valMatriz[3, 4],valMatriz[4, 4])
 fimpara
fimpara
Fimalgoritmo