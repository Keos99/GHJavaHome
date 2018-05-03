package GHHomeProject.Chapter5;

class A2{
    A2(){
        System.out.println("Конструктор класса A");
    }
}

class B2 extends A2{
    B2(){
        System.out.println("Конструктор класса B");
    }
}

class C2 extends B2{
    C2(){
        System.out.println("Конструктор класса C");
    }
}

public class OrderOfConstruction {
    public static void main(String[] args) {
        C2 c = new C2();
    }
}
