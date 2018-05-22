package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW5.src;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class MainClass {
    public static final int CARS_COUNT = 4;
    public static Semaphore semaphore = new Semaphore(2);
    public static CyclicBarrier cyclicBarrier = new CyclicBarrier(CARS_COUNT);
    public static ArrayList <Thread> threads = new ArrayList<>();
    public static CountDownLatch countDownLatch = new CountDownLatch(CARS_COUNT);
    public static CountDownLatch countDownLatch2 = new CountDownLatch(1);
    public static CountDownLatch countDownLatch3 = new CountDownLatch(CARS_COUNT);
    public static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

        Race race = new Race(new Road(60), new Tunnel(semaphore), new Road(40));
        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cyclicBarrier,countDownLatch,
                    countDownLatch2,countDownLatch3,reentrantLock);
        }

        for (int i = 0; i < cars.length; i++) {
            threads.add(new Thread(cars[i]))
            ;
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        try {
            countDownLatch3.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}
