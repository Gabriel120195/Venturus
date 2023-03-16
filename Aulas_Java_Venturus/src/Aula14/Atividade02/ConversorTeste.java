package Aula14.Atividade02;

public class ConversorTeste {
    public static void main(String[] args) {
        Conversor conversor1 = new Conversor();
        conversor1.qtdDolares = 250.00;
        conversor1.conversao();
        conversor1.status();
        System.out.println(" ");

        Conversor conversor2 = new Conversor();
        conversor2.qtdDolares = 50.40;
        conversor2.conversao();
        conversor2.status();
        System.out.println(" ");

        Conversor conversor3 = new Conversor();
        conversor3.qtdDolares = 545.70;
        conversor3.conversao();
        conversor3.status();
    }
}
