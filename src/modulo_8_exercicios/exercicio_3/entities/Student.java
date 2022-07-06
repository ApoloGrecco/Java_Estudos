package modulo_8_exercicios.exercicio_3.entities;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double FinalGrade(){
        return nota1 + nota2 + nota3;
    }

    public String toString(){

        if (FinalGrade() >= 60){
            return "PASS";
        }else {
            return "FALIED\n"
                    + "MISSING "
                    + (60 - FinalGrade())
                    + " POINTS";
        }

    }

}
