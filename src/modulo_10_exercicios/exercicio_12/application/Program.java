package modulo_10_exercicios.exercicio_12.application;

import modulo_10_exercicios.exercicio_12.Util.Employee_null;
import modulo_10_exercicios.exercicio_12.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
         * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.
         * Não deve haver repetição de id.
         * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa
         *  deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
         *  mostrar a listagem atualizada dos funcionários, conforme exemplos.
         * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
         *  Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployeers = new ArrayList<>();

        System.out.print("How many employeers will be registered? ");
        int quantityEmployeers = sc.nextInt();
        System.out.println();

        for(int i = 0; i < quantityEmployeers; i++){
            sc.nextLine();
            System.out.println("Employeer #" + (1 + i) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            Employee emp = new Employee(id, name, salary);

            listEmployeers.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idEmployee = sc.nextInt();
        Integer pos = Employee_null.hasId(listEmployeers, idEmployee);
        if (pos == null){
            System.out.println("This employee id does not exist.");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            listEmployeers.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees");
        for(Employee emp : listEmployeers){
            System.out.println(emp);
        }

        sc.close();
    }

}
