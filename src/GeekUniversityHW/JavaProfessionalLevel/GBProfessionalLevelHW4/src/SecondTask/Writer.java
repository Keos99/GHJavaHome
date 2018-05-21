package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW4.src.SecondTask;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Writer {
    Object object = new Object();
    static FileWriter fileWriter = null;
    static int i;

    public void  Write() {
        try {
            fileWriter = new FileWriter("Thread.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (i = 1; i <= 3; i++) {
            executorService.execute(new Thread() {
                @Override
                public void run() {
                    synchronized (object){
                        for (int j = 0; j <10; j++) {
                            try {
                                fileWriter.flush();
                                fileWriter.write(currentThread().getName()+ "\n");
                                try {
                                    Thread.sleep(20);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });
        }
        executorService.shutdown();
    }
}

