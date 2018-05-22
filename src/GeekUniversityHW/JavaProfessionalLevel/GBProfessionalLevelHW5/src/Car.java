package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW5.src;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

public class Car extends Thread {
    private static int CARS_COUNT;

    static {
        CARS_COUNT = 0;
    }

    CyclicBarrier cyclicBarrier;
    CountDownLatch countDownLatch;
    CountDownLatch countDownLatch2;
    CountDownLatch countDownLatch3;
    ReentrantLock reentrantLock;
    private Race race;
    private int speed;
    private String name;

    public String getCarName() {
        return this.name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch,
               CountDownLatch countDownLatch2, CountDownLatch countDownLatch3, ReentrantLock reentrantLock) {
        this.cyclicBarrier = cyclicBarrier;
        this.countDownLatch = countDownLatch;
        this.countDownLatch2 = countDownLatch2;
        this.countDownLatch3 = countDownLatch3;
        this.reentrantLock = reentrantLock;
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public void win(){
        reentrantLock.lock();
        if (countDownLatch2.getCount() == 1){
            System.out.println(this.name + " WIN");
            countDownLatch2.countDown();
        }
        reentrantLock.unlock();
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            countDownLatch.countDown();
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        win();
        countDownLatch3.countDown();
    }
}
