package Aula14.Atividade01;

public class AreaTriangulo {
    double a;
    double b;
    double c;
    double area;
    void status() {
        System.out.println("ÁREA = " + this.area);
    }
    void calculaArea() {
        double p = (a + b + c) / 2;
        double x = p * (p-a) * (p-b) * (p-c);
        double s = Math.sqrt(x);
        this.area = s;
    }
}
