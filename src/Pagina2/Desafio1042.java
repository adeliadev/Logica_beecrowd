package Pagina2;

import java.util.Scanner;

public class Desafio1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1º valor: ");
        int a = sc.nextInt();
        System.out.print("2º valor: ");
        int b = sc.nextInt();
        System.out.print("3º valor: ");
        int c = sc.nextInt();

        int[] listaDeNumeros = {a, b, c};

        java.util.Arrays.sort(listaDeNumeros);

        System.out.print("\nLista ordenada: ");
        for(int numero : listaDeNumeros){
            System.out.printf("%d ", numero);
        }

        System.out.printf("%nLista original: %d %d %d%n", a, b, c);

/*
        MANUALMENTE COM IF

        int maior = 0;
        int meio = 0;
        int menor = 0;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }
*/

    }
}
