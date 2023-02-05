Algoritmo "Ex 04 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Escreva um Algoritmo que calcule a média de um aluno numa dada disciplina e
//imprima o resultado.
//Regra: Durante o semestre o aluno faz 3 avaliações com notas de 0 a 10.
//É considerado aprovado, o aluno que consegue nota igual ousuperior a 7.
//Se este ficar com nota menor que 7 e maior ou igual a 5, será considerado de
//recuperação. No entanto, se a nota for abaixo de 5, o aluno será considerado
//reprovado e deverá repetir o semestre.

Var
   // Seção de Declarações das variáveis
p1, p2, p3, media : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Nota da 1º prova: ")
  leia(p1)
escreva("Nota da 2º prova: ")
  leia(p2)
escreva("Nota da 3º prova: ")
  leia(p3)
  
media <- (p1 + p2 + p3) / 3

  se (media > 10) entao
     escreval("Valores das provas incorretos !")
senao
  se (media > 7) entao
      escreval("APROVADO !")
senao
  se ((media < 7) e (media >= 5)) entao
      escreval("RECUPERAÇÃO !")
  senao
      escreva("REPROVADO !")

fimse
fimse
fimse

Fimalgoritmo
