package modulo10_exercicios.exercicio_9.application;

import modulo10_exercicios.exercicio_9.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
         Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser
         armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];
        String nomeVelho = "";

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "ª pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(nome, idade);
        }

        int idade = pessoas[0].getIdade();
        for(int i=0; i<n; i++){
            if(pessoas[i].getIdade() > idade){
                idade = pessoas[i].getIdade();
                nomeVelho = pessoas[i].getNome();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomeVelho);

        sc.close();
    }
}
