package modulo_4_exercicios;

import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        /*
         Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
         deste círculo com quatro casas decimais conforme exemplos.

          Fórmula da área: area = π * raioˆ2
          Considere o valor de π = 3.14159
         */

        Scanner sc = new Scanner(System.in);
        double raio, area;
        double pi = 3.14159;

        System.out.println("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();

        area = pi * (Math.pow(raio, 2));

        System.out.printf("O valor da área do circulo é de %.4f", area);

        sc.close();


    }
}
