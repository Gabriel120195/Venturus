package Aula05;

public class Ex02_TrueOuFalse {
    public static void main(String[] args) {

        System.out.println((10 == 10) && (10 == 20) ? "True" : "False");

        System.out.println((11 == 12) && (20 == 20) ? "True" : "False");

        System.out.println((15 == 15) && (16 == 16) ? "True" : "False");

        System.out.println((12 == 11) && (23 == 24) ? "True" : "False");

        System.out.println((10 == 10) || (10 == 20) ? "True" : "False");

        System.out.println((11 == 12) || (20 == 20) ? "True" : "False");

        System.out.println((15 == 15) || (16 == 16) ? "True" : "False");

        System.out.println((12 == 11) || (23 == 24) ? "True" : "False");
    }
}
