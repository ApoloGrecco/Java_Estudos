package modulo_10_exercicios.exercicio_4.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        int contador = 0;

        System.out.println("NUMEROS PARES:");
        for (int i=0; i<n; i++){
            if(vetor[i] % 2 ==0){
                System.out.print(vetor[i] + "  ");
                contador++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + contador);

        sc.close();
    }
}
