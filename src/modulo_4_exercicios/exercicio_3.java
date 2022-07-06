package modulo_4_exercicios;

import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule
            e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula:

            DIFERENCA = (A * B - C * D).
         */

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("Digite o primeiro valor: ");
        A = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        B = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        C = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("A diferença entre o produto A e B pelo produto C e D: " + diferenca);

        sc.close();

    }
}
