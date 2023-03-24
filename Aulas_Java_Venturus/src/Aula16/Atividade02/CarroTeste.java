package Aula16.Atividade02;

public class CarroTeste {
    public static void main(String[] args) {
        Carro fusca = new Carro("Cinza","Volkswagen",2018,100);
        fusca.mostrarCarro();
        fusca.ligar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.desligar();

        System.out.println(" ");

        System.out.println("=====================");

        System.out.println(" ");

        Carro civic = new Carro("Preto","Honda",2023,200);
        civic.mostrarCarro();
        civic.acelerar();
        civic.ligar();
        civic.acelerar();
        civic.acelerar();
        civic.desligar();
    }
}
