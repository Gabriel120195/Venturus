Algoritmo "Ex Desafio - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 03/02/2023

//Escreva um algoritmo que leia três lados quaisquer. Identifique se esses
//lados podem formar um triângulo. Caso os lados formem um triângulo,
//identifique se o triângulo é equilátero, escaleno ou isóceles.

//Regra: Suponha os lados a, b e c.

//É triangulo somente se a condição for satisfeita: (a+b)>c e (a+c)>b e (b+c)>a
//Equilátero: todos os lados iguais. Escaleno: todos os lados diferentes.
//Isóceles: dois lados são iguais
Var
// Seção de Declarações das variáveis
a, b, c:Real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Digite o PRIMEIRO Valor: ")
 leia(a)
escreva("Digite o SEGUNDO Valor: ")
 leia(b)
escreva("Digite o TERCEIRO Valor: ")
 leia(c)

 se((a > (b+c)) ou (b > (a+c)) ou (c > (b+a))) entao
      escreval("Não é Triângulo")

senao

 se(a = b) e (a = c) entao
      escreval("O triângulo é EQUILÁTEROS")

senao

 se(a = b) ou (a = c) ou (b = c) entao
      escreval("O triângulo é ISÓSCELES")

senao
     escreva("O triângulo é ESCALENO")

fimse
fimse
fimse

fimalgoritmo




