package Aula12;

import javax.swing.*;

public class Ex01 {
    public static void main(String[] args) {

        String nomes [] = new String [5];
        double nota1 [] = new double[5];
        double nota2 [] = new double[5];
        double medias [] = new double[5];
        double somaDasMedias = 0;
        double mediaTurma = 0;

        for (int i = 0; i < 5; i++) {

            nomes[i] = JOptionPane.showInputDialog(null,"Nome do Aluno: ");

            nota1[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Primeira Nota: "));

            nota2[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Segunda Nota: "));

            medias[i] = (nota1[i] + nota2[i]) / 2;
            somaDasMedias = somaDasMedias + medias[i];
        }

        System.out.println("=====================");

        mediaTurma = somaDasMedias / 5;

        System.out.println("Média da Turma = " + mediaTurma);
        
        System.out.println("=====================");

        for (int i = 0; i < 5; i++) {
            if (medias[i] > mediaTurma) {
                System.out.println("Aluno = " + nomes[i] + " / Média = " + medias[i]);
            }
        }
    }
}
