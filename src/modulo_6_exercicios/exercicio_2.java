package modulo_6_exercicios;

import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        /*
            Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos
            no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo
            será encerrado quando pelo menos uma de duas coordenadas for NULA
            (nesta situação sem escrever mensagem alguma).
         */

        Scanner sc = new Scanner(System.in);
        int valor_x, valor_y;

        System.out.println("Escreva a coordenada de X: ");
        valor_x = sc.nextInt();

        System.out.println("Escreva a coordenada de Y: ");
        valor_y = sc.nextInt();

        while (valor_x != 0 && valor_y != 0){

            if (valor_x > 0 && valor_y > 0){
                System.out.println("Primeiro\n");

            }else if(valor_x < 0 && valor_y > 0) {
                System.out.println("Segundo\n");

            }else if(valor_x < 0) {
                System.out.println("Terceiro\n");

            }else{
                System.out.println("Quarto\n");
            }

            System.out.println("Escreva a coordenada de X: ");
            valor_x = sc.nextInt();

            System.out.println("Escreva a coordenada de Y: ");
            valor_y = sc.nextInt();

        }

        sc.close();
    }
}
