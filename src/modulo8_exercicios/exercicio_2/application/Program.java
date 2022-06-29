package modulo8_exercicios.exercicio_2.application;

import modulo8_exercicios.exercicio_2.entities.Employee;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar
            os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com
            base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente
            os dados do funcionário. Use a classe projetada abaixo.
        */

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.IncreaseSalary(percentage);
        System.out.printf("Employee: " + employee);


        sc.close();
    }

}
