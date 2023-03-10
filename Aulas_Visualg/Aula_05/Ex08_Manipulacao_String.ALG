Algoritmo "Ex 08 - Manipulacao_String"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/02/2023

//Faça um algoritmo para demonstrar
//as principais funcões de manipulacão de strings do visualg.

var
N: Caractere
C: Inteiro

inicio
Escreva("Digite seu nome: ")
 Leia(N)
EscrevaL("Total de letras do seu nome: ", Compr(N))
EscrevaL("Seu nome em maiusculas e ", Maiusc(N))
EscrevaL("Seu nome em minusculas e ", Minusc(N))
EscrevaL("A primeira letra do seu nome e ", Copia(N, 1, 1))
EscrevaL("A ultima letra do seu nome e ", Copia(Maiusc(N), Compr(N), 1))
EscrevaL("Seu nome tem a letra A na posicao ", Pos("A", Maiusc(N)))
EscrevaL("O codigo da letra A e ", Asc("A"))
EscrevaL("A letra de codigo 65 e ", Carac(65))

Para C <- Compr(N) ate 1 passo -1 faca
 Escreva(Copia(Maiusc(N),C,1))
FimPara
fimalgoritmo