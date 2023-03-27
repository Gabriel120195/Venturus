package Aula20.Atividade03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt.txt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (IOException e){
            System.out.println("Caminho do documento não encontrado! " + e.getMessage());
        }finally {
            if (scan != null) {
                scan.close();
            }
            System.out.println("O bloco Finally foi executado!");
        }
    }
}
