package Aula14.Atividade05;

public class Retangulo {
    double altura;
    double largura;
    double area;
    double perimetro;
    double diagonal;
    void status () {
        System.out.printf("\nRetângulo ÁREA = " + "%.2f",this.area);
        System.out.printf("\nRetângulo PERÍMETRO = " + "%.2f",this.perimetro);
        System.out.printf("\nRetângulo DIAGONAL = " + "%.2f",this.diagonal);
    }
    void CalculaArea() {
        double a = largura * altura;
        this.area = a;
    }
    void CalculaPerimetro() {
        double p = 2 * (largura + altura);
        this.perimetro = p;
    }
    void CalculaDiagonal() {
        double d = Math.sqrt((largura * largura) + (altura * altura));
        this.diagonal = d;
    }
}
