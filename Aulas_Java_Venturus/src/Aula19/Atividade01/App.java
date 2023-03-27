package Aula19.Atividade01;

public class App {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();

        gerente1.setNome("Gabriel");
        gerente1.setCpf("11122233345");
        gerente1.setSalario(4000.00);
        gerente1.apresentar();
        gerente1.autenticaSenha(0055);
    }
}
