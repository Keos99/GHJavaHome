package GHHomeProject.Chapter4;

class StaticDemo{
    int x;
    static int y;

    int sum(){
        return x + y;
    }
}

public class SDemo {
    public static void main(String[] args) {
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();

        staticDemo1.x = 10;
        staticDemo2.x = 20;
        System.out.println("Разумеется, staticDemo1.x и staticDemo2.x независимы");
        System.out.println("staticDemo1.x: " + staticDemo1.x + "\nstaticDemo2.x: " + staticDemo2.x);
        System.out.println();
        System.out.println("Статистическая переменная y - общая");

        StaticDemo.y = 19;
        System.out.println("Присвоить StaticDemo.y значение 19");

        System.out.println("staticDemo1.sum: " + staticDemo1.sum());
        System.out.println("staticDemo2.sum: " + staticDemo2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Присвоить StaticDemo.y значение 100");

        System.out.println("staticDemo1.sum: " + staticDemo1.sum());
        System.out.println("staticDemo2.sum: " + staticDemo2.sum());
        System.out.println();
    }
}
