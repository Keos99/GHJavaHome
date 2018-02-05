package Chapter4;

class Overload2{
    void f(int x){
        System.out.println("Внутри f(int): " + x);
    }

    void f(double x){
        System.out.println("Внутри f(double): " + x);
    }
}

public class TypeConv {
    public static void main(String[] args) {
        Overload2 overload2 = new Overload2();

        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5f;

        overload2.f(i);
        overload2.f(d);
        overload2.f(b);
        overload2.f(s);
        overload2.f(f);
    }
}
