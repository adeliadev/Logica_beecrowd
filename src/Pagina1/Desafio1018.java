package Pagina1;

import java.util.Scanner;

public class Desafio1018 {
    public static void main(String[] args) {
        // conversão de valor em cédulas
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        int valor = sc.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeDeNotas = new int[notas.length];

        int valorOriginal = valor;

        for (int i = 0; i < notas.length; i++){
            quantidadeDeNotas[i] = valor / notas[i];
            valor %= notas[i];
        }

        System.out.printf("Valor lido: %d%n", valorOriginal);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(quantidadeDeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
        }

        sc.close();
    }
}
