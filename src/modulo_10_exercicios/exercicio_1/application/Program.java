package modulo_10_exercicios.exercicio_1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

      /*
      Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
      e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
      */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for(int i=0 ; i<n; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i=0; i<n; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }


        sc.close();
    }
}
