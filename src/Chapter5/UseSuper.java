package Chapter5;

class A{
    int i;
}

class B extends A{
    int i;

    B (int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("i в суперклассе " + super.i);
        System.out.println("i в подклассе " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B b = new B(1,2);
        b.show();
    }
}
