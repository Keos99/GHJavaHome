package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW4.src.FirstTask;

public class A extends Thread {
    Letters letters;

    A (Letters letters) {
        this.letters = letters;
        new Thread (this,"A").start();
    }

    public void run() {
        while (true) {
            int a = letters.getA();
            letters.A();
            if (a == 6) return;
        }
    }
}
