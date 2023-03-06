Algoritmo "Desafio 01"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Faça um programa que lê 4 valores I, A, B e C onde I é um número inteiro e
//positivo e A, B, e C são quaisquer valores reais. O programa deve escrever os
//valores lidos e:
//se I = 1, escrever os três valores A, B e C em ordem crescente;
//se I = 2, escrever os três valores A, B e C em ordem decrescente;
//se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique
//entre os outros dois;
//se I não for um dos três valores acima, dar uma mensagem indicando este
//comportamento

Var
// Seção de Declarações das variáveis 
I : inteiro
a, b, c : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("1- Ordem Crescente / 2- Ordem Decrescente / 3- Maior valor fica no meio")
 leia(I)
 
escreva("Digite o Primeiro Valor: ")
 leia(a)
escreva("Digite o Segundo Valor: ")
 leia(b)
escreva("Digite o Terceiro Valor: ")
 leia(c)
 
escolha I

caso 1
      se ((a > b) e (a > c) e (b > c)) entao
        escreva(c,b,a)
     senao
      se ((a > b) e (a > c) e (c > b)) entao
        escreva(b,c,a)
     senao
      se ((b > a) e (b > c) e (a > c)) entao
        escreva(c,a,b)
     senao
      se ((b > a) e (b > c) e (c > a)) entao
        escreva(a,c,b)
     senao
      se ((c > a) e (c > b) e (a > b)) entao
        escreva(b,a,c)
     senao
      se ((c > a) e (c > b) e (b > a)) entao
        escreva(a,b,c)
      senao
           escreva("Existe valores iguais!")
     fimse
     fimse
     fimse
     fimse
     fimse
     fimse

caso 2
      se ((a > b) e (a > c) e (b > c)) entao
        escreva(a,b,c)
     senao
      se ((a > b) e (a > c) e (c > b)) entao
        escreva(a,c,b)
     senao
      se ((b > a) e (b > c) e (a > c)) entao
        escreva(b,a,c)
     senao
      se ((b > a) e (b > c) e (c > a)) entao
        escreva(b,c,a)
     senao
      se ((c > a) e (c > b) e (a > b)) entao
        escreva(c,a,b)
     senao
      se ((c > a) e (c > b) e (b > a)) entao
        escreva(c,b,a)
      senao
           escreva("Existe valores iguais!")
     fimse
     fimse
     fimse
     fimse
     fimse
     fimse

caso 3
      se ((a > b) e (a > c) e (b > c)) entao
        escreva(b,a,c)
     senao
      se ((a > b) e (a > c) e (c > b)) entao
        escreva(c,a,b)
     senao
      se ((b > a) e (b > c) e (a > c)) entao
        escreva(a,b,c)
     senao
      se ((b > a) e (b > c) e (c > a)) entao
        escreva(c,b,a)
     senao
      se ((c > a) e (c > b) e (a > b)) entao
        escreva(a,c,b)
     senao
      se ((c > a) e (c > b) e (a > b)) entao
        escreva(b,c,a)
      senao
           escreva("Existe valores iguais")
     fimse
     fimse
     fimse
     fimse
     fimse
     fimse
     
outrocaso
     escreva("Opção não permitida")

fimescolha
 
Fimalgoritmo