package Pagina1;

import java.util.Scanner;

public class Desafio1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Idade em dias: ");
        int idade = sc.nextInt();

        int anos = idade / 365;
        int meses = (idade % 365) / 30;
        int dias =  (idade % 365) % 30;

        System.out.printf("%d ano(s)%n", anos);
        System.out.printf("%d mes(es)%n", meses);
        System.out.printf("%d dia(s)%n", dias);

        sc.close();
    }
}
