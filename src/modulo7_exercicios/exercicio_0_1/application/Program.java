package modulo7_exercicios.exercicio_0_1.application;

import modulo7_exercicios.exercicio_0_1.entities.Triangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaX){
            System.out.println("Larger area: X");
        }else if (areaX == areaY){
            System.out.println("X and Y have the same area");
        }else{
            System.out.println("Large area: Y");
        }


        sc.close();
    }
}
