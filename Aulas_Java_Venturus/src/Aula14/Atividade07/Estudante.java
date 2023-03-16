package Aula14.Atividade07;

public class Estudante {
    double n1,n2,n3;

    void mediaFinal(){
        double calN1 = (n1 / 30) * 100;
        double calN2 = (n2 / 35) * 100;
        double calN3 = (n3 / 35) * 100;
        double somaNotas = calN1 + calN2 +calN3;
        double mediaFinal = somaNotas;

        if (somaNotas >= 60) {
            System.out.printf("Aprovado!");
        }
        else {
            somaNotas = 60 - somaNotas;
            System.out.println("Reprovado!");
            System.out.printf("Pontos necessários para ser Aprovado: " + "%.0f",somaNotas);
        }
        System.out.printf("\n=========\nMédia = " + "%.0f", mediaFinal);
    }
}
