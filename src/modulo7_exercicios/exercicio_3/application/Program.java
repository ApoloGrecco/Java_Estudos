package modulo7_exercicios.exercicio_3.application;

import modulo7_exercicios.exercicio_3.entities.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do
            ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a
            nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso
            negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
            Você deve criar uma classe Student para resolver este problema.
        */

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Digite o nome do aluno: ");
        student.name = sc.nextLine();

        System.out.print("Digite a nota do primeiro semestre: ");
        student.nota1 = sc.nextDouble();

        System.out.print("Digite a nota do segundo semestre: ");
        student.nota2 = sc.nextDouble();

        System.out.print("Digite a nota do terceiro semestre: ");
        student.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.FinalGrade());
        System.out.println(student);


    }

}
