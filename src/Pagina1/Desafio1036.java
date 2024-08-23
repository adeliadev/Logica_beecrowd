package Pagina1;

import java.util.Scanner;

public class Desafio1036 {
    public static void main(String[] args) {
        // Fórmula de baskhara
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        double a = sc.nextDouble();;
        System.out.print("Valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Valor de C: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Impossivel calcular");
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);

                System.out.printf("R1 = %.5f%n", x1);
                System.out.printf("R2 = %.5f%n", x2);
            }
        }

        sc.close();
    }
}
