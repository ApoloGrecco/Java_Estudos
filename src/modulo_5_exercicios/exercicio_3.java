package modulo_5_exercicios;

import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        /*
            Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
             "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números
             devem poder ser digitados em ordem crescente ou decrescente.
        */

        Scanner sc = new Scanner(System.in);
        int valor_a, valor_b;

        System.out.println("Digite o primeiro número: ");
        valor_a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        valor_b = sc.nextInt();

        if ((valor_a % valor_b) == 0 || (valor_b % valor_a) ==  0){
            System.out.println("São multiplos");
        }else {
            System.out.println("Não são multiplos");
        }

        sc.close();

    }

}
