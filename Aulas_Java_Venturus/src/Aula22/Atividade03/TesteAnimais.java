package Aula22.Atividade03;

public class TesteAnimais {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        System.out.println("=====Falar Frase=====");
        cachorro.reagir("agradavel");

        System.out.println("=====Horário do Dia=====");
        cachorro.reagir(15);

        System.out.println("=====Dono=====");
        cachorro.reagir(true);

        System.out.println("=====Idade e Peso=====");
        cachorro.reagir(4,10);
    }
}
