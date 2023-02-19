package Aula02;

public class Atividade1 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Tablet";

        int idade = 40;
        int codigo = 4040;

        char sexo = 'M';

        double preco1 = 5100.0;
        double preco2 = 1000.50;
        double medida = 53.34567;

        System.out.println("Produtos:");

        System.out.println(produto1 + " Preço Total: R$ " + preco1);
        System.out.println(produto2 + " Preço Total: R$ " + preco2);
        System.out.println("Registro: " + idade + " anos, codigo " + codigo + " e sexo " + sexo);
        System.out.println("Medida com oito casas decimais: ");
        System.out.println("Medida com duas casas decimais: ");
    }
}
