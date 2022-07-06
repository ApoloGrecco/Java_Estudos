package modulo_10_exercicios.exercicio_3.Util;

import modulo_10_exercicios.exercicio_3.entities.Pessoa;

public class Calculos {

    public static double media(Pessoa[] pessoas){
        double sum = 0;
        for(int i=0; i<pessoas.length; i++){
            sum += pessoas[i].getAltura();
        }
        return sum / pessoas.length;
    }

    public static void porcentagem(Pessoa[] pessoas, int n){
        int count = 0;
        for(int i=0; i< pessoas.length; i++){
            if(pessoas[i].getIdade() < n){
                count++;
            }
        }
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", (double)count / pessoas.length * 100);
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < n) {
                System.out.println(pessoa.getName());
            }
        }
    }
}
