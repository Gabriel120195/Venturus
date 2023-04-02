package Aula22.Atividade01;

public class FuncionarioTercerizado extends Funcionario{

    public FuncionarioTercerizado(String nome, int horas, double valorPorHora) {
        super(nome, horas, valorPorHora);
    }

    @Override
    public double pagamento() {
        return super.pagamento();
    }
}
