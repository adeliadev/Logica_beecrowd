package Pagina1;

import java.util.Scanner;

public class Desafio1035 {
    // Vários valores e condições
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de A: ");
        int a = sc.nextInt();
        System.out.print("Valor de B: ");
        int b = sc.nextInt();
        System.out.print("Valor de C: ");
        int c = sc.nextInt();
        System.out.print("Valor de D: ");
        int d = sc.nextInt();

        int somaAB = a + b;
        int somaCD = c + d;

        if (b > c && d > a && somaCD > somaAB && c >= 0 && d >= 0 && a % 2 == 0) {
            System.out.println("Valores aceitos!");
        } else {
            System.out.println("Valores não aceitos!");
        }

    }
}
