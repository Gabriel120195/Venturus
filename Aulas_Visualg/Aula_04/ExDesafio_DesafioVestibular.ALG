Algoritmo "DesafioVestibular"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023

Var
// Se��o de Declara��es das vari�veis 
nvagas, cm, cf, tc: inteiro
pcf, cpv, mncv: real
cadastrar: caracter
curso, cod_c: caracter

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
cadastrar<- "s"
mncv<- 0
tc<- 0
enquanto cadastrar = "s" faca
escreva("O c�digo do curso: ")
leia(cod_c)
escreva("O n� de vagas do curso: ")
leia(nvagas)
escreva("O n� de candidatos masculino: ")
leia(cm)
escreva("O n� de candidatos feminino: ")
leia(cf)
tc<- tc + (cm + cf)
cpv<- (cm + cf) / nvagas
pcf<- cf / (cm + cf) * 100
se(mncv<cpv) entao
mncv<- cpv
curso<- cod_c
fimse

escreval("------------------- x xx---------------------")
escreval("O numero de cadidatos por vaga �: ",cpv)
escreval("O curso ",cod_c," teve ",pcf," % de candidatas mulheres")
escreva("Cadastrar outro curso(s/n)? ")
leia(cadastrar)
fimenquanto
escreval("---------------------------------- x xx ------------------------------------")
escreval("O curso ",curso," teve o maior numero de cadidatos por vaga que �: ",mncv)
escreval("O total de candidatos �: ",tc)

Fimalgoritmo