package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW4.src.FirstTask;

public class C extends Thread{
    Letters letters;

    C (Letters letters) {
        this.letters = letters;
        new Thread (this,"C").start();
    }

    public void run() {
        while (true) {
            int c = letters.getC();
            letters.C();
            if (c == 6)return;
        }
    }
}
