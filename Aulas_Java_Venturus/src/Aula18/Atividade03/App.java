package Aula18.Atividade03;

public class App {
    public static void main(String[] args) {
        LinguagemPrograma pessoa1 = new LinguagemPrograma("Maria","Python",15);
        System.out.println("===== Pessoa 01 =====");
        pessoa1.pessoa();
        pessoa1.linguagemProgramacao();
        pessoa1.experiencia();
        System.out.println(" ");

        LinguagemPrograma pessoa2 = new LinguagemPrograma("João","Java",10);
        System.out.println("===== Pessoa 02 =====");
        pessoa2.pessoa();
        pessoa2.linguagemProgramacao();
        pessoa2.experiencia();
    }
}
