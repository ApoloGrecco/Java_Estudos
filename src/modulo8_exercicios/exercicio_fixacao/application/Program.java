package modulo8_exercicios.exercicio_fixacao.application;

import modulo8_exercicios.exercicio_fixacao.util.CurrencyConverter;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprador por uma pessoa
        * em rais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que
        * pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos
        * cálculos.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        System.out.printf("\nAmount to be paid in reais = %.2f", CurrencyConverter.Calculator(dollar, quantity));

        sc.close();
    }
}
