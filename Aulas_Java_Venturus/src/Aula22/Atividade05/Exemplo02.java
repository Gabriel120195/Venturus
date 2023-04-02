package Aula22.Atividade05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo02 {
    public static void main(String[] args) {

        String path = "C:\\Users\\gabri\\OneDrive\\Documentos\\Venturus\\aula22Ex05.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
