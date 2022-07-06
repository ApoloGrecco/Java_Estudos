package modulo_6_exercicios;

import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        /*
            Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
            Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma:
            1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
            deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código
            informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
            abasteceram cada tipo de combustível, conforme exemplo.
        */

        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, opc;

        System.out.println("Selecione qual seu combustível de preferencia");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim\n");

        System.out.print("Selecione uma opção: ");
        opc = sc.nextInt();

        while(opc != 4) {
            if (opc == 1) {
                alcool += 1;
            }
            else if (opc == 2) {
                gasolina += 1;
            }
            else if (opc == 3) {
                diesel += 1;
            }

            System.out.print("Selecione uma opção: ");
            opc = sc.nextInt();
        }


        System.out.println("Muito obrigado\n");

        System.out.println("Quantidade de combustíveis escolhidos:");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }

}
