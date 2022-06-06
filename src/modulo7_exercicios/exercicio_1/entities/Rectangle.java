package modulo7_exercicios.exercicio_1.entities;


public class Rectangle {

    public double width;
    public double height;

    public double Area(){
        return width * height;

    }

    public double Perimeter(){
        return 2 * (width + height);

    }

    public double Diagonal(){
        double number_width = Math.pow(width, 2.0);
        double number_height = Math.pow(height, 2.0);
        return Math.sqrt( number_width + number_height );


    }

}
