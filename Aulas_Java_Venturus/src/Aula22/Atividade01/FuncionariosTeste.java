package Aula22.Atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FuncionariosTeste {
    public static void main(String[] args) {
        List<Funcionario> funcionariosLista = new ArrayList<>();
        List<FuncionarioTercerizado> funcionariosTerceiroLista = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario("Gabriel",8,25.00);
        Funcionario funcionario2 = new Funcionario("Luis",50,25.00);
        Funcionario funcionario3 = new Funcionario("Daniel",15,25.00);
        Funcionario funcionario4 = new Funcionario("Thiago",23,25.00);

        FuncionarioTercerizado funcionarioT1 = new FuncionarioTercerizado("Laura",4,25.00);
        FuncionarioTercerizado funcionarioT2 = new FuncionarioTercerizado("Paula",25,250.00);
        FuncionarioTercerizado funcionarioT3 = new FuncionarioTercerizado("Sandra",10,20.00);
        FuncionarioTercerizado funcionarioT4 = new FuncionarioTercerizado("Neusa",45,100.00);

        funcionariosLista.add(funcionario1);
        funcionariosLista.add(funcionario2);
        funcionariosLista.add(funcionario3);
        funcionariosLista.add(funcionario4);

        funcionariosTerceiroLista.add(funcionarioT1);
        funcionariosTerceiroLista.add(funcionarioT2);
        funcionariosTerceiroLista.add(funcionarioT3);
        funcionariosTerceiroLista.add(funcionarioT4);

        System.out.println(funcionariosLista);
        System.out.println(" ");
        System.out.println("====================================");
        System.out.println(" ");
        System.out.println(funcionariosTerceiroLista);
    }
}
