package modulo_5_exercicios;

import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        */

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite o número: ");
        numero = sc.nextInt();

        if ((numero % 2) == 0){
            System.out.println("Numero par");
        } else {
            System.out.println("Número impar");
        }

        sc.close();

    }

}
