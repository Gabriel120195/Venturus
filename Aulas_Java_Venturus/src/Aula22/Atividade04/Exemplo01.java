package Aula22.Atividade04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scan = null;

        File file = new File("C:\\Users\\gabri\\OneDrive\\Documentos\\Venturus\\aula22Ex04.txt");

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());

        }finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
