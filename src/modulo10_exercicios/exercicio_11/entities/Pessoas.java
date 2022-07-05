package modulo10_exercicios.exercicio_11.entities;

public class Pessoas {

    private double altura;
    private char sexo;

    public Pessoas(double altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }
}
