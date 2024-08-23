package Pagina1;

import java.util.Scanner;

public class Desafio1019 {
    public static void main(String[] args) {
        // Segundos em horas
        Scanner sc = new Scanner(System.in);

        System.out.print("Duração em segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("%d segundos formatados em horas: %d:%d:%d%n", totalSegundos, horas
        , minutos, segundos);

        sc.close();
    }
}
