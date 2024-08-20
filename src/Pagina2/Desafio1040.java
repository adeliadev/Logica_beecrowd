package Pagina2;

import java.util.Scanner;

public class Desafio1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1ª nota: ");
        double n1 = sc.nextDouble();
        System.out.print("2ª nota: ");
        double n2 = sc.nextDouble();
        System.out.print("3ª nota: ");
        double n3 = sc.nextDouble();
        System.out.print("4ª nota: ");
        double n4 = sc.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
        System.out.printf("Média: %.1f%n", media);

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame!");

            System.out.print("Nota tirada no exame: ");
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);

            double mediaComExame = (media + notaExame) / 2;

            if (mediaComExame >= 5) {
                System.out.println("Aluno aprovado!");
                System.out.printf("Média final: %.1f%n", mediaComExame);
            } else {
                System.out.println("Aluno reprovado!");
                System.out.printf("Média final: %.1f%n", mediaComExame);
            }
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
