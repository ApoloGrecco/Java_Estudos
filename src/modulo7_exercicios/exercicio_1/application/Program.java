package modulo7_exercicios.exercicio_1.application;

import modulo7_exercicios.exercicio_1.entities.Rectangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida,
            mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado
            no projeto ao lado.
        */

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();

        double area = rectangle.Area();
        System.out.printf("AREA = %.2f%n", area);

        double perimeter = rectangle.Perimeter();
        System.out.printf("PERIMETER = %.2f%n", perimeter);

        double diagonal = rectangle.Diagonal();
        System.out.printf("DIAGONAL = %.2f%n", diagonal);

        sc.close();

    }
}
