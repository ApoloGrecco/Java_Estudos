package modulo_5_exercicios;

import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {

        /*
            Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
             A seguir, calcule e mostre o valor da conta a pagar.
         */

        Scanner sc = new Scanner(System.in);
        int codigo_item, qtd_item;
        double total;

        System.out.println("Digite o código do item: ");
        codigo_item = sc.nextInt();

        System.out.println("Digite a quantidade deste item: ");
        qtd_item = sc.nextInt();


        if (codigo_item == 1){
            total = qtd_item * 4.00;
            System.out.printf("Total: R$%.2f", total);

        } else if (codigo_item == 2) {
            total = qtd_item * 4.50;
            System.out.printf("Total: R$%.2f", total);

        } else if (codigo_item == 3) {
            total = qtd_item * 5.00;
            System.out.printf("Total: R$%.2f", total);

        } else if (codigo_item == 4) {
            total = qtd_item * 2.00;
            System.out.printf("Total: R$%.2f", total);

        } else{
            total = qtd_item * 1.50;
            System.out.printf("Total: R$%.2f", total);

        }

        sc.close();

    }

}
