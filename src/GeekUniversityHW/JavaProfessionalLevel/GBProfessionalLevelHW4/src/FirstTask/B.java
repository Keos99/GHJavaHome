package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW4.src.FirstTask;

public class B extends Thread {
    Letters letters;

    B (Letters letters) {
        this.letters = letters;
        new Thread (this,"B").start();
    }

    public void run() {
        while (true) {
            int b = letters.getB();
            letters.B();
            if (b == 6)return;
        }
    }
}
