package Pagina1;

import java.util.Scanner;

public class Desafio1013 {
    public static void main(String[] args) {
        // maior entre A, B e C
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = sc.nextInt();
        System.out.print("Valor de B: ");
        int b = sc.nextInt();
        System.out.print("Valor de ABS: ");
        int c = sc.nextInt();

        int maiorAb = (a + b + Math.abs(a - b)) / 2;

        int maiorABC = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

        System.out.printf("%d é o maior número entre os 3.%n", maiorABC);

        sc.close();
    }
}
