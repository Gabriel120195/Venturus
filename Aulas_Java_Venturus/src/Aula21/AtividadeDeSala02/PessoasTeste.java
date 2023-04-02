package Aula21.AtividadeDeSala02;

public class PessoasTeste {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("Gabriel","425.777.888-95");
        System.out.println(pessoaFisica.toString());

        System.out.println("========================");

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Gabriel.S.A","1111.447.52/0005");
        System.out.println(pessoaJuridica.toString());

    }
}
