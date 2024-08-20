package Pagina1;

import java.util.Scanner;

public class Desafio1017 {
    public static void main(String[] args) {
        // gasto de combustível
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo de viagem [horas]: ");
        int tempo = sc.nextInt();
        System.out.print("Velocidade média [km/h]: ");
        int velocidade = sc.nextInt();

        int distancia = tempo * velocidade;

        int kmPorLitro = 12;
        double combustivelGasto = (double) distancia / kmPorLitro;

        System.out.printf("Combustível gasto na viagem: %.2fL%n", combustivelGasto);

        sc.close();
    }

}
