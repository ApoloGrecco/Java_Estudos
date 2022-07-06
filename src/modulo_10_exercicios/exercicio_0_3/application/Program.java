package modulo_10_exercicios.exercicio_0_3.application;

import modulo_10_exercicios.exercicio_0_3.entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        /*
        A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos
        identificados pelos números 0 a 9.
        Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o
        número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N
        estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos
         ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
         um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int bedrooms = 9;
        System.out.print("How many rooms will be rented? ");
        int numberOfRooms = sc.nextInt();
        System.out.println();

        Students[] students = new Students[bedrooms];

        for (int i = 0; i < numberOfRooms; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();
            students[room] = new Students(name, email, room);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < bedrooms; i++){
            if (students[i] != null){
                System.out.println(students[i]);
            }
        }

        sc.close();
    }
}
