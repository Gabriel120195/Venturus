package Aula13.Exemplo01;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.modelo = "Bic";
        caneta1.carga = 90;
        caneta1.tamnhoPonta = 0.7f;
        caneta1.tampada = false;
        caneta1.rabiscar();
        caneta1.status();
        System.out.println(" ");


        Caneta caneta2 = new Caneta();
        caneta2.cor = "Preta";
        caneta2.modelo = "Pentel";
        caneta2.carga = 50;
        caneta2.tamnhoPonta = 0.9f;
        caneta2.tampada = true;
        caneta2.rabiscar();
        caneta2.status();
        System.out.println(" ");


        Caneta caneta3 = new Caneta();
        caneta3.cor = "Vermelha";
        caneta3.modelo = "Pilot";
        caneta3.carga = 10;
        caneta3.tamnhoPonta = 0.5f;
        caneta3.tampada = false;
        caneta3.rabiscar();
        caneta3.status();
    }
}
