package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW4.src.ThirdTask;

public class Main {
    public static void main(String[] args) {
        MFU mfu = new MFU();
        new Thread(() -> {mfu.print(); }).start();
        new Thread(() -> {mfu.print(); }).start();
        new Thread(() -> {mfu.print(); }).start();
        new Thread(() -> {mfu.print(); }).start();
        new Thread(() -> {mfu.scan(); }).start();
        new Thread(() -> {mfu.scan(); }).start();
        new Thread(() -> {mfu.scan(); }).start();
        new Thread(() -> {mfu.scan(); }).start();
    }
}
