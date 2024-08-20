package Pagina1;

import java.util.Scanner;

public class Desafio1015 {
    public static void main(String[] args) {
        // distância entre dois pontos
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Digite o valor de y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Digite o valor de x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Digite o valor de y2: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("A distância entre os pontos é de: %.4f%n", distancia);

        sc.close();
    }
}
