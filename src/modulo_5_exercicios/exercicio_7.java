package modulo_5_exercicios;

import java.util.Scanner;

public class exercicio_7 {

    public static void main(String[] args) {

        /*
           Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
           A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos
           Sou na origem (x = y = 0).
            Se o ponto estiver na origem, escreva a mensagem “Origem”.
            Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
         */

        Scanner sc = new Scanner(System.in);
        double valor_x, valor_y;

        System.out.println("Escreva a coordenada de X: ");
        valor_x = sc.nextDouble();

        System.out.println("Escreva a coordenada de Y: ");
        valor_y = sc.nextDouble();

        if (valor_x == 0 && valor_y == 0) {
            System.out.println("Origem");

        } else if (valor_x > 0) {
            if (valor_y > 0){
                System.out.println("Q1");
            }else {
                System.out.println("Q4");
            }

        }else {
            if (valor_y > 0){
                System.out.println("Q2");
            }else {
                System.out.println("Q3");
            }
        }

        sc.close();
    }
}
