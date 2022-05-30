package modulo4_exercicios;

import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor
         que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o
         salário do funcionário, com duas casas decimais.
         */

        Scanner sc = new Scanner(System.in);

        int numero_funcionario, horas_trabalhada;
        double salary_hora, salary;

        System.out.println("Digite o número do funcionário");
        numero_funcionario = sc.nextInt();

        System.out.println("Digite as horas trabalhadas");
        horas_trabalhada = sc.nextInt();

        System.out.println("Digite o valor por hora trabalhada");
        salary_hora = sc.nextDouble();

        salary = salary_hora * horas_trabalhada;

        System.out.println("Número do funcionário:" + numero_funcionario);
        System.out.printf("Salário do funcionário: %.2f", salary);

        sc.close();
    }
}
