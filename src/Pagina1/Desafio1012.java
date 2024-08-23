package Pagina1;

import java.util.Scanner;

public class Desafio1012 {
    public static void main(String[] args) {
        // Área do triângulo, círculo, trapézio, quadrado e retângulo
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor A: ");
        double a = sc.nextDouble();
        System.out.print("Valor B: ");
        double b = sc.nextDouble();
        System.out.print("Valor C: ");
        double c = sc.nextDouble();

        double pi = 3.14159;

        double triangulo = (a * c) / 2;
        double circulo = pi * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.println("\n==== ÁREAS ====");
        System.out.printf("Triângulo: %.3f%n", triangulo);
        System.out.printf("Círculo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retângulo: %.3f%n", retangulo);

        sc.close();
    }
}
