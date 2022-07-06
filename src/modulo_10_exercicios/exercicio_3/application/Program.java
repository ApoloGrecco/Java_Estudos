package modulo_10_exercicios.exercicio_3.application;

import modulo_10_exercicios.exercicio_3.Util.Calculos;
import modulo_10_exercicios.exercicio_3.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela
        a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os
        nomes dessas pessoas caso houver.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(name, idade, altura);
        }


        System.out.printf("Altura média: %.2f \n", Calculos.media(pessoas));
        Calculos.porcentagem(pessoas, 16);

        sc.close();
    }
}
