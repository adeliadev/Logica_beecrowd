package Pagina1;

public class Desafio1009 {
    public static void main(String[] args) {
        String nomeFuncionario = "João";
        double salarioFixo = 500.00;
        double vendasMensais = 1230.30;

        double calculoBonus = vendasMensais * 0.15;
        double calculoSalario = salarioFixo + calculoBonus;
        System.out.printf("Salário com bônus: R$%.2f%n", calculoSalario);
    }
}
