package modulo10_exercicios.exercicio_5.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior
        número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a
        primeira posição como 0 (zero).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeors voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i=0; i<vetor.length; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        int posicao = 0;

        for(int i=0; i<vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}
