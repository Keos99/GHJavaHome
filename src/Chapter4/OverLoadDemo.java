package Chapter4;

class Overload{

    void ovlDemo(){
        System.out.println("Без параметров");
    }

    void ovlDemo(int a){
        System.out.println("Один параметр " + a);
    }

    double ovlDemo(double a, double b){
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }
}

public class OverLoadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        int resI;
        double resD;

        overload.ovlDemo();
        System.out.println();

        overload.ovlDemo(2);
        System.out.println();

        resI = (int) overload.ovlDemo(4,6);
        System.out.println(resI);
        System.out.println();

        resD = overload.ovlDemo(1.1,2.32);
        System.out.println(resD);
    }
}
