package Aula19.Exemplo02;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Gabriel");
        aluno1.setIdade(28);
        aluno1.setSexo("Masculino");
        aluno1.setMatricula(1234);
        aluno1.setCurso("Ed fisica");
        aluno1.pagarMensalidade();
        System.out.println(aluno1.toString());
        System.out.println("===================================================");

        Bolsista bolsista1 = new Bolsista();

        bolsista1.setNome("Laura");
        bolsista1.setIdade(14);
        bolsista1.setSexo("Feminino");
        bolsista1.setBolsa(450.00f);
        bolsista1.pagarMensalidade();
        System.out.println(bolsista1.toString());
    }
}
