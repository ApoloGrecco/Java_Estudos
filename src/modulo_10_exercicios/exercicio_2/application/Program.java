package modulo_10_exercicios.exercicio_2.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        double soma = 0;
        double media = 0;

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++){
            soma += vetor[i];
            if (i == n-1){
                media = soma/n;
            }
        }

        System.out.print("\nVALORES = ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f  ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f", media);

        sc.close();
    }
}
