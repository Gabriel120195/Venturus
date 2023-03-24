package Aula16.Atividade03;

public class OperacaoMatematicaTeste {
    public static void main(String[] args) {
        OperacaoMatematica primeiroValor = new OperacaoMatematica();

        //System.out.println("N = PROTEGIDO");
        //primeiroValor.N = 4;
        //primeiroValor.negativoOuPositivo();
        //primeiroValor.parOuImpar();


        System.out.println("N =  PRIVADO");
        primeiroValor.setN(8);
        primeiroValor.negativoOuPositivo();
        primeiroValor.parOuImpar();

    }
}
