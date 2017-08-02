package Chapter2;

class MyClass1 {
    int x;

    MyClass1(){
        x = 10;
    }
}

public class ConsDemo {
    public static void main(String[] args) {
        MyClass1 t1 = new MyClass1();
        MyClass1 t2 = new MyClass1();

        System.out.println(t1.x + " " + t2.x);
    }
}
