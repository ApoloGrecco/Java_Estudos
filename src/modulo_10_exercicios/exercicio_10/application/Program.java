package modulo_10_exercicios.exercicio_10.application;

import modulo_10_exercicios.exercicio_10.entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1o e
        2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos
        alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        Alunos[] alunos = new Alunos[n];

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + " aluno: ");
            alunos[i] = new Alunos(sc.nextLine(), sc.nextDouble(), sc.nextDouble());
        }

        System.out.println("\nAlunos aprovados: ");
        for(int i=0; i<n; i++){
            if(alunos[i].mediaAluno(alunos[i].getNota1(), alunos[i].getNota2()) >= 6.0){
                System.out.println(alunos[i].getNome());
            }
        }


        sc.close();
    }
}
