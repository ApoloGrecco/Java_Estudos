package modulo_8_exercicios.exercicio_fixacao.util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double Calculator(double dollar, double quantity){
        return ( dollar * quantity ) + ( ( dollar * quantity ) * IOF );
    }
}
