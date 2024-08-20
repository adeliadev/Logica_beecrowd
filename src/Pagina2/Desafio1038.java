package Pagina2;

import java.util.Scanner;

public class Desafio1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CARDÁPIO ===");
        System.out.println("[1] Cachorro-quente: R$4.00");
        System.out.println("[2] X-Salada: R$4.50");
        System.out.println("[3] X-Bacon: R$5.00");
        System.out.println("[4] Torrada simples: R$2.00");
        System.out.println("[5] Refrigerante: R$1.50");

        System.out.println("================");
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        double preco, precoTotal = 0;
        switch (codigo) {
            case 1:
                preco = 4.00;
                precoTotal = preco * quantidade;
                break;
            case 2:
                preco = 4.50;
                precoTotal = preco * quantidade;
                break;
            case 3:
                preco = 5.00;
                precoTotal = preco * quantidade;
                break;
            case 4:
                preco = 2.00;
                precoTotal = preco * quantidade;
                break;
            case 5:
                preco = 1.50;
                precoTotal = preco * quantidade;
                break;
            default:
                System.out.println("Digite uma opção válida!");
        }

        System.out.printf("Preço total: R$%.2f%n", precoTotal);

    }
}
