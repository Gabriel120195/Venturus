package Aula22.Atividade03;

public class Cachorro extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }

    public void reagir(String frase){

        if (frase == "agradavel") {
            System.out.println("Abanar e Latir");
        } else if (frase == "agressiva") {
            System.out.println("Rosnar!");
        }else {
            System.out.println("Frase incorreta, Cachorro sem reação!");
        }
    }

    public void reagir(int hora){

        if (hora < 23) {
            if (hora >= 6 && hora <= 12) {
                System.out.println("Manhã = Abanar Rabo!");

            } else if (hora >= 12 && hora <= 18) {
                System.out.println("Tarde = Abanar e Latir!");

            } else if (hora > 18 && hora <= 23 || hora >= 0) {
                System.out.println("Noite = Ignorar!");
            }

        }else {
            System.out.println("Horário inválido!");
        }
    }

    public void reagir(boolean dono){

        if (dono == true) {
            System.out.println("É dono = Abanar Rabo!");
        }else {
            System.out.println("Não é dono = Rosnar e Latir!");
        }
    }

    public void reagir(int idade, double peso){

        if (5 >= idade || 10 >= peso) {

            if (idade <= 5 && peso > 10) {
                System.out.println("Novo e Pesado = Latir!!");

            } else if (idade > 5 && peso < 10) {
                System.out.println("Velho e Leve = Rosnar!!");

            }else {
                System.out.println("Novo e Leve = Abanar!!");
            }

        }else {
            System.out.println("Velho e Pesado = Ignorar");
        }
    }

    public void enterrarOsso(){
        System.out.println("Enterrando Osso!!");
    }
    public void abanar(){
        System.out.println("Abanando o Rabo!!");
    }
}
