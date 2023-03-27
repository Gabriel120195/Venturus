package Aula18.Atividade02;

public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(8);
        quadrado.getNomeFigura();
        quadrado.getArea();
        quadrado.getPerimetro();
        System.out.println(" ");

        System.out.println("============================");

        Triangulo triangulo = new Triangulo(5,8,6);
        triangulo.getNomeFigura();
        triangulo.getArea();
        triangulo.getPerimetro();
    }
}
