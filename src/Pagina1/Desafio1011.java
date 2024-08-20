package Pagina1;

import java.util.Scanner;

public class Desafio1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio da esfera: ");
        double raio = sc.nextDouble();
        double pi = 3.14159;

        double volume = (4.0 / 3) * pi * Math.pow(raio, 3);
        System.out.printf("O volume da esfera é de %.3f%n", volume);

        sc.close();
    }
}
