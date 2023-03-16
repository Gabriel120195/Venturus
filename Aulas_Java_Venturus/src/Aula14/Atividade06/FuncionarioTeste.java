package Aula14.Atividade06;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        System.out.println("Salário Com Desconto");
        funcionario1.nome = "Gabriel";
        funcionario1.salarioBruto = 2000;
        funcionario1.imposto = 4.5;
        funcionario1.SalarioLiquido();
        funcionario1.status();
        System.out.println(" ");
        System.out.println("==========");

        System.out.println("Salário Atualizado");
        funcionario1.AumentoSalario();
        funcionario1.status();
    }
}
