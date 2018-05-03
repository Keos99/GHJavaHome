package GHHomeProject.Chapter4;

class MyClass2{
    int x;

    MyClass2 (){
        System.out.println("Внутри MyClass2().");
        x = 0;
    }

    MyClass2 (int i){
        System.out.println("Внутри MyClass2 (int).");
        x = i;
    }

    MyClass2 (double d){
        System.out.println("Внутри MyClass2 (double).");
        x = (int)d;
    }

    MyClass2 (int i, int j){
        System.out.println("Внутри MyClass2 (int, int).");
        x = i * j;
    }
}

public class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass2 myClass21 = new MyClass2();
        MyClass2 myClass22 = new MyClass2(88);
        MyClass2 myClass23 = new MyClass2(17.23);
        MyClass2 myClass24 = new MyClass2(2,4);

        System.out.println("1" + myClass21.x);
        System.out.println("2" + myClass22.x);
        System.out.println("3" + myClass23.x);
        System.out.println("4" + myClass24.x);
    }
}
