package GHHomeProject.Chapter4;

class Test {
    int a;
    int b;

    Test (int i, int j){
        a = i;
        b = j;
    }
    void change(Test test){
        test.a = test.a + test.b;
        test.b = -test.b;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        Test test = new Test(15,20);
        System.out.println(test.a + " " + test.b);
        test.change(test);
        System.out.println(test.a + " " + test.b);
    }
}
