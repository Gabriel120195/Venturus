package Aula14.Atividade02;

public class Conversor {
    double cotacaoDolar = 5.10;
    double qtdDolares;

    double resultado;

    void status() {
        System.out.printf("Valor R$ " + "%.2f",this.resultado);
    }
    void conversao() {
        double calculo = (cotacaoDolar * qtdDolares);
        double iof = ((calculo * 6) / 100);
        this.resultado = calculo + iof;
    }
}
