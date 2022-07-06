package modulo_10_exercicios.exercicio_8.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética
        somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar
        a mensagem "NENHUM NUMERO PAR"
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int media = 0;
        int cont = 0;

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] % 2 == 0){
                media += vetor[i];
                cont++;
            }
        }


        if(media <= 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{
            media = media / cont;
            System.out.println("MEDIA DOS PARES = " + media);
        }

        sc.close();
    }


}
