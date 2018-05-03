package GHHomeProject.Chapter5;

class A4{
    int i;
    int j;

    A4(int a,int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("i и j: " + i + " " + j);
    }
}

class B4 extends A4{
    int k;

    B4(int a, int b, int c){
        super(a,b);
        k = c;
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}

public class Overload {
    public static void main(String[] args) {
        B4 subB4 = new B4(1,2,3);

        subB4.show("k: ");
        subB4.show();
    }
}
