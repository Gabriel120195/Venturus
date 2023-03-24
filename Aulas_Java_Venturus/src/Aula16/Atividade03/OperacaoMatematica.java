package Aula16.Atividade03;

public class OperacaoMatematica {

    //Com variavel protegida.
    //protected int N;

    //Com variavel Privada.
    private int N;

    public void negativoOuPositivo(){
        if (N > 0) {
            System.out.println(N +  " = Número Positivo!!");
        }else {
            System.out.println(N + " = Número Negativo!!");
        }
    }
    public void parOuImpar(){
        if (N % 2 == 0) {
            System.out.println(N + " = Par!");
        }else {
            System.out.println(N + " = Impar!");
        }
    }
    public int getN() {
        return N;
    }
    public void setN(int n) {
        N = n;
    }
}
