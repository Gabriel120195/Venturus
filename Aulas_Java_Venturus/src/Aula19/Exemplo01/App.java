package Aula19.Exemplo01;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Gabriel");
        p2.setNome("Laura");
        p3.setNome("Fabricio");
        p4.setNome("Sandra");

        p1.setSexo("M");
        p2.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Matematica");
        p3.receberAumento(550.20f);

        p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
