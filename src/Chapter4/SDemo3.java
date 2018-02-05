package Chapter4;

class StaticBlock{
    static double rootof2;
    static double rootof3;

    static {
        rootof2 = Math.sqrt(2.0);
        rootof3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg){
        System.out.println(msg);
    }
}

public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock("Внутри конструктора");

        System.out.println("Корень квадратный из 2 равен: " + StaticBlock.rootof2);
        System.out.println("Корень квадратный из 3 равен: " + StaticBlock.rootof3);
    }
}
