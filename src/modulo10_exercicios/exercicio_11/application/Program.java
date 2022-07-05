package modulo10_exercicios.exercicio_11.application;

import modulo10_exercicios.exercicio_11.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
           Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule
          e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoas[] pessoas = new Pessoas[n];

        double maiorAltura = 0;
        double mediaMulheres = 0;
        int cont = 0;
        int qtdHomens = 0;


        for(int i=0; i<n; i++){
            System.out.printf("Altura da %dª pessoa: ", i+1);
            double altura = sc.nextDouble();

            System.out.printf("Genero da %dª pessoa: ", i+1);
            char sexo = sc.next().charAt(0);

            pessoas[i] = new Pessoas(altura, sexo);
        }

        double menorAltura = pessoas[0].getAltura();
        for(int i=0; i<n; i++) {
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }

            if (maiorAltura < pessoas[i].getAltura()) {
                maiorAltura = pessoas[i].getAltura();
            }

            if (pessoas[i].getSexo() == 'F') {
                mediaMulheres += pessoas[i].getAltura();
                cont++;
            }

            if (pessoas[i].getSexo() == 'M') {
                qtdHomens++;
            }
        }

        mediaMulheres = mediaMulheres / cont;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das mulheres = %.2f\n", mediaMulheres);
        System.out.println("Numero de homens = " + qtdHomens);

        sc.close();
    }
}
