package Aula14.Atividade07;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        System.out.printf("\nAluno 1: ");
        estudante.n1 = 7;
        estudante.n2 = 10;
        estudante.n3 = 7;
        estudante.mediaFinal();
        System.out.println(" ");

        System.out.printf("\nAluno 2: ");
        Estudante estudante2 = new Estudante();
        estudante2.n1 = 2;
        estudante2.n2 = 0;
        estudante2.n3 = 5;
        estudante2.mediaFinal();
    }
}
