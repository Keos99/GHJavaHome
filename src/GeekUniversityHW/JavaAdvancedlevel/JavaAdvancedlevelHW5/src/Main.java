package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW5.src;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreads myThreads = new MyThreads();
        myThreads.method1();
        try {
            myThreads.method2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
