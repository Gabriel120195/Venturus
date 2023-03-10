Algoritmo "DadosDasPessoas"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Gabriel
// Data atual  : 11/02/2023
Var
i, homens, mulheres: inteiro
nome, sexo, nome_alto: caractere
peso, altura, media_peso, percentual_h, percentual_m, total_peso, mais_alto: real

Inicio
para i de 1 ate 4 faca
Escreval("Número de cadastrao: ", i)
Escreval("Digite o nome: ")
 Leia(nome)
Escreval("Digite o peso: ")
 Leia(peso)
Escreval("Digite a altura: ")
 Leia(altura)
Escreval("Digite o sexo - (m)Masculino ou (f)Feminino: ")
 Leia(sexo)

      //selecionando as pessoas por sexo
      se(sexo="m")entao
         homens <- homens + 1
      senao
         se(sexo="f")entao
            mulheres <- mulheres + 1
         fimse
      fimse

      //Calculando a pessoa mais alta
      se(altura > mais_alto)entao
         mais_alto <- altura
         nome_alto <- nome
      fimse

      //Calculando o peso total
      total_peso <- total_peso + peso
   fimpara

   //Calculando média do peso
   media_peso <- total_peso/4

   //Calculando percentual de homens
   percentual_h <- (homens/4)

   //Calculando percentual de mulheres
   percentual_m <- (mulheres/4)

   Escreval("HOMENS: ", homens, " Porcentagem: ", percentual_h:3:2, "%")
   Escreval("MULHERES: ", mulheres, " Porcentagem: ", percentual_m:3:2, "%")
   Escreval("MÉDIA DE PESO DOS CADASTRADOS: ", media_peso:3:2)
   Escreval("CADASTRADO MAIS ALTO(A): ", nome_alto)

Fimalgoritmo