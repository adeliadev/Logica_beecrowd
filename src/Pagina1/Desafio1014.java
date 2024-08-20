package Pagina1;

import java.util.Scanner;

public class Desafio1014 {
    public static void main(String[] args) {
        // consumo médio de um automóvel
        Scanner sc = new Scanner(System.in);

        System.out.print("Distância percorrida: ");
        int distancia = sc.nextInt();
        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        double consumo = distancia / combustivel;
        System.out.printf("Consumo médio: %.3f km/l%n", consumo);

        sc.close();
    }
}
