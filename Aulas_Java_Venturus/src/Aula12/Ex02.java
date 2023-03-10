package Aula12;

import javax.swing.*;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String times [] = new String [10];

        for (int i = 0; i < 10; i++) {

            times[i] = JOptionPane.showInputDialog(null,(i+1) + " = Time: ");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i != j) {
                    System.out.println(times[i] + " x " + times[j]);
                }
            }
        }
    }
}
