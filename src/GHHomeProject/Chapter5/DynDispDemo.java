package GHHomeProject.Chapter5;

class Sup{
    void who(){
        System.out.println("who() в Sup");
    }
}

class Sup1 extends Sup{
    void who(){
        System.out.println("who() в Sup1");
    }
}

class  Sup2 extends Sup{
    void who(){
        System.out.println("who() в Sup2");
    }
}

public class DynDispDemo {
    public static void main(String[] args) {
        Sup sup = new Sup();
        Sup1 sup1 = new Sup1();
        Sup2 sup2 = new Sup2();

        Sup supRef;

        supRef = sup;
        sup.who();

        supRef = sup1;
        sup1.who();

        supRef = sup2;
        sup2.who();
    }
}
