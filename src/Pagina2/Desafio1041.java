package Pagina2;

import java.util.Scanner;

public class Desafio1041 {
    public static void main(String[] args) {
        // Coordenadas de um ponto
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de X: ");
        double x = sc.nextDouble();
        System.out.println("Valor de Y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
    }
}
