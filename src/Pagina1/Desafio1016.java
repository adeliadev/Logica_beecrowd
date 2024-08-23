package Pagina1;

import java.util.Scanner;

public class Desafio1016 {
    public static void main(String[] args) {
        // Distância entre carro X e carro Y
        Scanner sc = new Scanner(System.in);

        // velocidade constante
        int carroX = 60;
        int carroY = 90;
        int diferencaVelocidade = carroY - carroX;

        System.out.print("Distância do carro Y: ");
        int distanciaDoCarroY = sc.nextInt();

        // tipo double pq utilizando os décimos do resto fica mais exato
        double tempoHoras = (double) distanciaDoCarroY / diferencaVelocidade;
        int tempoMinutos = (int) (tempoHoras * 60);

        System.out.printf("Tempo necessário (minutos): %d.0f%n", tempoMinutos);

        sc.close();
    }
}
