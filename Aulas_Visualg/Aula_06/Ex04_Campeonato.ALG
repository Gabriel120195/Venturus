Algoritmo "Ex04_Tabela_Campeonato"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atujl  : 11/02/2023

var
  time: vetor[1..5] de Caractere
  l, c: Inteiro
inicio
   EscrevaL("------------------")
   EscrevaL("CAMPEONATO FUTEBOL")
   EscrevaL("------------------")
   Para c <- 1 ate 5 faca
      Escreva ("Nome do ", c, "o. time: ")
      Leia(time[c])
   FimPara

   LimpaTela
   EscrevaL("-------------------")
   EscrevaL(" TABELA DE PARTIDAS")
   EscrevaL("-------------------")
   Para l <- 1 ate 5 faca
      Para c <- 1 ate 5 faca
         Se (l <> c) entao
            EscrevaL(time[l]:4, " [ ] x [ ] ", time[c]:12)
         FimSe
      FimPara
   FimPara
fimalgoritmo