package Pagina1;

public class Desafio1010 {
    public static void main(String[] args) {
        // Valor total de uma compra
        int codigoPeca1 = 12;
        int numeroPeca1 = 1;
        double valorPeca1 = 5.30;

        int codigoPeca2 = 16;
        int numeroPeca2 = 2;
        double valorPeca2 = 5.10;

        double valorTotal = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

        System.out.printf("Valor total: R$%.2f%n", valorTotal);
    }
}
