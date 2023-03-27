package Aula19.Atividade02;

public class App {
    public static void main(String[] args) {
        Homem homem = new Homem();
        Cao cao = new Cao();
        Gato gato = new Gato();
        Papagaio papagaio = new Papagaio();

        System.out.println("=====HOMEM=====");
        homem.setNome("Gabriel");
        homem.setIdade(28);
        homem.falar();
        System.out.println("===Sem Fome===");
        homem.setFome(false);
        homem.comer();
        System.out.println("==Com Fome==");
        homem.setFome(true);
        homem.comer();
        System.out.println(homem.toString());
        System.out.println(" ");

        System.out.println("====================");

        System.out.println("=====CÃO=====");
        cao.setNome("Saimon");
        cao.setIdade(10);
        cao.falar();
        System.out.println("===Sem Fome===");
        cao.setFome(false);
        cao.comer();
        System.out.println("==Com Fome==");
        cao.setFome(true);
        cao.comer();
        System.out.println(cao.toString());
        System.out.println(" ");

        System.out.println("====================");

        System.out.println("=====GATO=====");
        gato.setNome("Marios");
        gato.setIdade(5);
        gato.falar();
        System.out.println("===Sem Fome===");
        gato.setFome(false);
        gato.comer();
        System.out.println("==Com Fome==");
        gato.setFome(true);
        gato.comer();
        System.out.println(gato.toString());
        System.out.println(" ");

        System.out.println("====================");

        System.out.println("=====PAPAGAIO=====");
        papagaio.setNome("Louro José");
        papagaio.setIdade(5);
        papagaio.falar();
        System.out.println("===Sem Fome===");
        papagaio.setFome(false);
        papagaio.comer();
        System.out.println("==Com Fome==");
        papagaio.setFome(true);
        papagaio.comer();
        System.out.println(papagaio.toString());
    }
}
