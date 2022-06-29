package modulo9_exercicios.exercicio_1.util;

import modulo9_exercicios.exercicio_1.entities.Account;

import java.util.Scanner;

public class Update {

    public static void update_account(Scanner sc, Account account) {
        System.out.println("Updated Data:" + account);

        System.out.println("How many deposit you want to make? ");
        int deposit = sc.nextInt();
        account.deposit(deposit);
        System.out.println("Updated Data:" + account);

        System.out.println("withdraw how much? ");
        int withdraw = sc.nextInt();
        account.withdraw(withdraw);
        System.out.println("Updated Data:" + account);
    }
}
