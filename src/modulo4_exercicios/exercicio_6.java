package modulo4_exercicios;

import java.util.Scanner;

public class exercicio_6 {

    public static void main(String[] args) {

        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
        Em seguida, calcule e mostre:

        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.

        Fórmula da área do triangulo = (base * altura) /2
        Fórmula da área do círculo = π * raioˆ2
        Fórmula da área do trapézio = (base x base) * altura / 2
        Fórmula da área do quadrado = ladoˆ2
        Fórmula da área do retângulo = base * altura

         */

        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        System.out.println("Valor de A: ");
        A = sc.nextDouble();
        System.out.println("Valor de B: ");
        B = sc.nextDouble();
        System.out.println("Valor de C: ");
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        circulo = pi * (Math.pow(C, 2));
        trapezio = ((A * B) * C) / 2;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("Área do Triangulo: %.3f%n", triangulo);
        System.out.printf("Área do Círculo: %.3f%n", circulo);
        System.out.printf("Área do Trapézio: %.3f%n", trapezio);
        System.out.printf("Área do Quadrado: %.3f%n", quadrado);
        System.out.printf("Área do Retângulo: %.3f%n", retangulo);


    }
}
