package modulo4_exercicios;

import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {

        /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
         o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         Calcule e mostre o valor a ser pago.
         */

        Scanner sc = new Scanner(System.in);

        int code1, number1;
        int code2, number2;
        double valor1, valor2, total;

        System.out.println("Código da primeira peça:");
        code1 = sc.nextInt();
        System.out.println("Quantidade de peças: ");
        number1 = sc.nextInt();
        System.out.println("Valor unitário por peças: ");
        valor1 = sc.nextDouble();

        System.out.println("Código da segunda peça:");
        code2 = sc.nextInt();
        System.out.println("Quantidade de peças: ");
        number2 = sc.nextInt();
        System.out.println("Valor unitário por peças: ");
        valor2 = sc.nextDouble();

        total = (number1 * valor1) + (number2 * valor2);
        System.out.println(code1);
        System.out.println(code2);
        System.out.printf("Valor total a ser pago: %.2f", total);

        sc.close();
    }
}
