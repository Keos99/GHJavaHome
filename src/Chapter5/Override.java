package Chapter5;

class A3{
    int i,j;

    A3(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i и j: " + i + " " + j);
    }
}

class B3 extends A3{
    int k;

    B3(int a, int b, int c){
        super(a,b);
        k = c;
    }

    void show(){
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B3 subB = new B3(1,2,3);
        subB.show();

    }
}
