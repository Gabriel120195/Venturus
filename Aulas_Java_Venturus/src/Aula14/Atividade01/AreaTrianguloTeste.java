package Aula14.Atividade01;

public class AreaTrianguloTeste {
    public static void main(String[] args) {
        AreaTriangulo areaTrianguloX = new AreaTriangulo();
        areaTrianguloX.a = 20;
        areaTrianguloX.b = 50;
        areaTrianguloX.c = 50;
        areaTrianguloX.calculaArea();
        areaTrianguloX.status();
        System.out.println(" ");

        AreaTriangulo areaTrianguloY = new AreaTriangulo();
        areaTrianguloY.a = 25;
        areaTrianguloY.b = 50;
        areaTrianguloY.c = 50;
        areaTrianguloY.calculaArea();
        areaTrianguloY.status();
        System.out.println(" ");

        System.out.println("==========");
        System.out.println(" ");

        if (areaTrianguloY.area < areaTrianguloX.area) {
            System.out.println("Maior área Triangulo X = " + areaTrianguloX.area);
        }
        else {
            System.out.println("Maior área Triangulo Y = " + areaTrianguloY.area);
        }
    }
}
