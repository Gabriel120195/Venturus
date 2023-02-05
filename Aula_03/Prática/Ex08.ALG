Algoritmo "Ex 08 - Prática"
// Disciplina   : [Algoritmos]
// Autor(a)    : Gabriel Roberto da Silva
// Data atual  : 04/01/2023

//Escreva um algoritmo que calcule o IMC de uma pessoa e imprima a
//situação em que ela se encontra.Resolva de duas formas:
//1) se..então..senão. 2) escolha..caso.

Var
// Seção de Declarações das variáveis 
peso, altura, imc : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Peso: ")
 leia(peso)
escreva("Altura:")
 leia(altura)
 
imc <- peso / altura^2

 se (imc < 16) entao
   escreva("Magreza Grave / IMC: ",imc:2:1)
senao
 se ((imc >= 16) e (imc < 17)) entao
   escreva("Magreza Moderada / IMC: ",imc:2:1)
senao
 se ((imc >= 17) e (imc < 18.5)) entao
   escreva("Magreza Leva / IMC: ",imc:2:1)
senao
 se ((imc >= 18.5) e (imc < 25)) entao
   escreva("Saudável / IMC: ",imc:2:1)
senao
 se ((imc >= 25) e (imc < 30)) entao
   escreva("Sobrepeso / IMC: ",imc:2:1)
senao
 se ((imc >= 30) e (imc < 35)) entao
   escreva("Obesidade Grau 1 / IMC: ",imc:2:1)
senao
 se ((imc >= 35) e (imc < 40)) entao
   escreva("Obesidade Grau 2 / IMC: ",imc:2:1)
senao
   escreva("Obesidade Grau 3 / IMC: ",imc:2:1)

fimse
fimse
fimse
fimse
fimse
fimse
fimse



Fimalgoritmo