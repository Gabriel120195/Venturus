package Aula14.Atividade03;

public class Salario {
    double salario;
    double aumento = 1.5;

    int i;

    void CalculaSalario() {
        for (i = 2010; i <= 2022; i++) {
            System.out.println("\nAno: " + this.i);
            System.out.printf("Salário R$ " + "%.2f",this.salario);

            if (i == 2010) {
                salario = (salario * aumento) / 100 + salario;
            }
            if (i >= 2011) {
                aumento = aumento + 1.5;
                salario = (salario * aumento) / 100 + salario;
            }
        }
    }
}
