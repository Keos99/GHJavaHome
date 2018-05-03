package GHHomeProject.Chapter1;

/**
 * Created by Keos99 on 23.04.2017.
 */
public class Example3 {
    public static void main(String args[]){
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Начальное значение прерменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println();

        var = var/4;
        x = x/4;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);
    }
}
