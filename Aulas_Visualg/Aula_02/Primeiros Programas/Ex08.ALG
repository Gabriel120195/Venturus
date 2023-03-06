Algoritmo "Ex 08 - Primeiros Programas"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 02/02/2023

//Crie um algoritmo que transforme grau em radiano, conforme as
//funções seno, cosseno e tangente. a) 30 b)90 c) 180 d) 270
Var
// Seção de Declarações das variáveis
grau, form_A, form_B, form_C, form_D :Real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Quantidade de GRAUS que deseja transformar: ")
 leia(grau)

form_A <- grau * pi / 30
form_B <- grau * pi / 90
form_C <- grau * pi / 180
form_D <- grau * pi / 270

escreval("Com Arco A)30: ",form_A:1:3," Radianos")
escreval("Com Arco B)90: ",form_B:1:3," Radianos")
escreval("Com Arco C)180: ",form_C:1:3," Radianos")
escreval("Com Arco D)270: ",form_D:1:3," Radianos")
Fimalgoritmo