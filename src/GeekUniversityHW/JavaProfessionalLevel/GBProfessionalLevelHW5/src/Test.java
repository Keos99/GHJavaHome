package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW5.src;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(20);
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 20; i++) {
            final int w = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Начало копирования файла " + w);
                        Thread.sleep(2000);
                        System.out.println("Завершено копирование файла " + w);
                        cdl.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        service.shutdown();
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Копирование файлов завершено");
    }
}
