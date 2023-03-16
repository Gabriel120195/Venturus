package Aula14.Atividade05;

public class RetanguloTeste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 5.0;
        retangulo.largura = 40;
        retangulo.CalculaArea();
        retangulo.CalculaPerimetro();
        retangulo.CalculaDiagonal();
        retangulo.CalculaDiagonal();
        retangulo.status();

        System.out.println("\n===========");

        Retangulo retangulo2 = new Retangulo();
        retangulo2.altura = 25;
        retangulo2.largura = 60.4;
        retangulo2.CalculaArea();
        retangulo2.CalculaPerimetro();
        retangulo2.CalculaDiagonal();
        retangulo2.CalculaDiagonal();
        retangulo2.status();
    }
}
