package Aula08;

import javax.swing.*;
public class Ex_Desafio {
    public static void main(String[] args) {

        float vf = 0;

        float valorProduto = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor do Produto: R$ "));

        int categoria = Integer.parseInt (JOptionPane.showInputDialog(null, "Categoria:  1 = Limpeza / 2 = Alimentação / 3 = Vestuário"));

        String situacao = JOptionPane.showInputDialog(null,"Situação: R = Necessita de Refrigeração / N = NÃO Necessita de Refrigeração");


        switch (categoria) {
            case 1:
                if (25 > valorProduto) {
                    vf = ((valorProduto * 5) /100) + valorProduto;
                }
                else {
                    vf = ((valorProduto * 12) /100) + valorProduto;
                }
                break;
            case 2:
                if (25 > valorProduto) {
                    vf = ((valorProduto * 8) /100) + valorProduto;
                }
                else {
                    vf = ((valorProduto * 15) /100) + valorProduto;
                }
                break;
            case 3:
                if (25 > valorProduto) {
                    vf = ((valorProduto * 10) /100) + valorProduto;
                }
                else {
                    vf = ((valorProduto * 18) /100) + valorProduto;
                }
                break;
            default:
                System.out.println("Categoria Inválida");
                break;
        }

        if ((categoria == 2) && (situacao.equals("R"))) {
            vf = vf - ((vf * 8) / 100);
            System.out.println("Desconto de 8%");
        }
        else if ((categoria == 2) || (situacao.equals("R"))) {
            vf = vf - ((vf * 5) / 100);
            System.out.println("Desconto de 5%");
        }
        else {
            System.out.println("Sem Desconto");
        }

        if (50.00 > vf) {
            System.out.println("BARATO");
            System.out.println("Valor R$ " + vf);
        }
        else if (vf >= 50.00 && 120.00 > vf) {
            System.out.println("NORMAL");
            System.out.println("Valor R$ " + vf);
        }
        else {
            System.out.println("CARO");
            System.out.println("Valor R$ " + vf);
        }
    }
}
