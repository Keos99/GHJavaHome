package KhasangHW.TrafficLight.src;

import java.util.Scanner;

public class Color {

    Scanner scanner = new Scanner(System.in);

    private String state;
    private long greentime;
    private long yellowtime;
    private long redtime;

    Color() {
        greentime = 120000;
        yellowtime = 180000;
        redtime = 300000;
    }

    void setGreentime(long time) {
        greentime = (time * 1000);
    }

    void setYellowtime(long time) {
        yellowtime = (time * 1000);
    }

    void setRedtime(long time) {
        redtime = (time * 1000);
    }

    long getGreentime() {
        return greentime;
    }

    long getYellowtime() {
        return yellowtime;
    }

    long getRedtime() {
        return redtime;
    }

    long getGreenTimeInSeconds() {
        long greentimeinseconds;
        greentimeinseconds = (greentime / 1000);
        return greentimeinseconds;
    }

    long getYellowTimeInSeconds() {
        long yellowtimeinseconds;
        yellowtimeinseconds = (yellowtime / 1000);
        return yellowtimeinseconds;
    }

    long getRedTimeInSeconds() {
        long redtimeinseconds;
        redtimeinseconds = (redtime / 1000);
        return redtimeinseconds;
    }

    synchronized void green(boolean running) throws InterruptedException {
        if (!running) {                         // остановить
            state = "green";
            notify();                           // уведомить ожидающие потоки
            return;
        }

        System.out.println("\tГорит зеленый свет");

        state = "green";
        Thread.sleep(getGreentime());
        notify();

        try {
            while (!(state.equals("yellow") || state.equals("red"))) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.err.println("прерывание потока");
        }
    }

    synchronized void yellow(boolean running) throws InterruptedException {
        if (!running) {                         // остановить
            state = "yellow";
            notify();                           // уведомить ожидающие потоки
            return;
        }

        System.out.println("\tГорит желтый свет");

        state = "yellow";
        Thread.sleep(getYellowtime());
        notify();

        try {
            while (!(state.equals("green") || state.equals("red"))) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.err.println("Прерывание потока");
        }
    }

    synchronized void red(boolean running) throws InterruptedException {
        if (!running) {                         // остановить
            state = "red";
            notify();                           // уведомить ожидающие потоки
            return;
        }

        System.out.println("\tГорит красный свет");

        state = "red";
        Thread.sleep(getRedtime());
        notify();

        try {
            while (!(state.equals("green") || !state.equals("yellow"))) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.err.println("Поток прерван");
        }
    }

}
