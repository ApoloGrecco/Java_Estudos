package modulo_5_exercicios;

import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        /*
            Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que
             o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
             máxima de 24 horas.
        */

        Scanner sc = new Scanner(System.in);
        int hora_inicial, hora_final, duracao;

        System.out.println("Digite a hora inicial do jogo: ");
        hora_inicial = sc.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        hora_final = sc.nextInt();


        if (hora_inicial < hora_final) {
            duracao = hora_final - hora_inicial;
        }else {
            duracao = 24 - hora_inicial;
            duracao += hora_final;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        sc.close();
    }

}
