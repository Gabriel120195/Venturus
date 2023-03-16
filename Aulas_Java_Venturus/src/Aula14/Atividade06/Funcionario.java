package Aula14.Atividade06;

public class Funcionario {
    String nome;
    double imposto;
    double salarioBruto;
    double salarioLiquido;
    void status() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário liquido R$ " + salarioLiquido);
    }
    void SalarioLiquido() {
        double s = salarioBruto - (salarioBruto * imposto) / 100;
        this.salarioLiquido = s;
    }
    void AumentoSalario() {
        double a = (salarioLiquido * 0.15) + salarioLiquido;
        this.salarioLiquido = a;
    }
}
