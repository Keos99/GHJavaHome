package GHHomeProject.Chapter1;

/**
 * Created by Keos99 on 23.04.2017.
 */
public class IfDemo {
    public static void main(String args[]){
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) System.out.println("a меньше b");
        if (a == b) System.out.println("Вы не должны увидеть этот текст");
        System.out.println();
        c = b - a;
        System.out.println("c содержит 1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
    }
}
