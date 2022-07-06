package modulo_5_exercicios;

import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        */

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        sc.close();

    }

}
