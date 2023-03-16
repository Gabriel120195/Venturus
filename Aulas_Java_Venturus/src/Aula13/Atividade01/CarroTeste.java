package Aula13.Atividade01;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Ford";
        carro1.cor = "Cinza";
        carro1.velocidade = 40.0;
        carro1.satus();
        carro1.frear();
        carro1.acelerar();
        carro1.acenderFarol();
        System.out.println(" ");

        Carro carro2 = new Carro();
        carro2.modelo = "Renault";
        carro2.cor = "Azul";
        carro2.velocidade = 0.0;
        carro2.satus();
        carro2.frear();
        carro2.acelerar();
        carro2.acenderFarol();
        System.out.println(" ");

        Carro carro3 = new Carro();
        carro3.modelo = "Fiat";
        carro3.cor = "Vermelho";
        carro3.velocidade = 80.0;
        carro3.satus();
        carro3.frear();
        carro3.acelerar();
        carro3.acenderFarol();
        System.out.println(" ");
    }
}
