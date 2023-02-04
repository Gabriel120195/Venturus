Algoritmo "Ex 09 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 02/02/2023

//Crie um algoritmo que lê três valores a, b e c. Indique se a=b, a>b,
//a>=b, c<b, c<>b. Imprima o resultado na tela.
Var
// Seção de Declarações das variáveis
a, b, c :Real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Digite o PRIMEIRO Valor: ")
 leia(a)
escreva("Digite o SEGUNDO Valor: ")
 leia(b)
escreva("Digite o TERCEIRO Valor: ")
 leia(c)
 
 se (a = b) entao
    escreval("A =",a ," é IGUAL B =",b)
 senao
      se (a >= b) entao
         escreval("A =",a ," é MAIOR que B =",b)
      senao
         escreval("B =",b ," é MAIOR que A =",a)
      fimse
fimse

 se (c < b) e (c <> b) entao
    escreval("B =",b ," é MAIOR e por tanto DIFERENTE de c =",c)
 senao
     se (c > b) e (c <> b) entao
        escreval("C =",c ," é MAIOR e por tanto DIFERENTE de B =",b)
     senao
        escreva("C =",c ," é IGUAL B =",b)
     fimse
fimse

Fimalgoritmo
