package Pagina1;

public class Desafio1008 {
    public static void main(String[] args) {
        int numeroFuncionario = 25;
        int horasTrabalhadas = 100;
        double valorPorHora = 5.50;

        double calculoSalario = horasTrabalhadas * valorPorHora;
        System.out.printf("Número: %d | Salário: U$%.2f%n", numeroFuncionario, calculoSalario);
    }
}
