Algoritmo "Ex 04 - Pr�tica"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Escreva um Algoritmo que calcule a m�dia de um aluno numa dada disciplina e
//imprima o resultado.
//Regra: Durante o semestre o aluno faz 3 avalia��es com notas de 0 a 10.
//� considerado aprovado, o aluno que consegue nota igual ousuperior a 7.
//Se este ficar com nota menor que 7 e maior ou igual a 5, ser� considerado de
//recupera��o. No entanto, se a nota for abaixo de 5, o aluno ser� considerado
//reprovado e dever� repetir o semestre.

Var
   // Se��o de Declara��es das vari�veis
p1, p2, p3, media : real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
escreva("Nota da 1� prova: ")
  leia(p1)
escreva("Nota da 2� prova: ")
  leia(p2)
escreva("Nota da 3� prova: ")
  leia(p3)
  
media <- (p1 + p2 + p3) / 3

  se (media > 10) entao
     escreval("Valores das provas incorretos !")
senao
  se (media > 7) entao
      escreval("APROVADO !")
senao
  se ((media < 7) e (media >= 5)) entao
      escreval("RECUPERA��O !")
  senao
      escreva("REPROVADO !")

fimse
fimse
fimse

Fimalgoritmo
