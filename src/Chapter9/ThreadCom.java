package Chapter9;

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {                         // остановить часы
            state = "ticked";
            notify();                           // уведомить ожидающие потоки
            return;
        }

        System.out.print("Tick ");

        state = "ticked";                       // установть состояние "тик"
        notify();                               // позволить выполнится методу tock

        try {
            while (!state.equals("tocked")){
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock (boolean running) {
        if (!running) {                         // остановить часы
            state = "tocked";
            notify();                           // уведомить ожидающие потоки
            return;
        }

        System.out.println("Tock");

        state = "tocked";
        notify();

        try {
            while (!state.equals("ticked")){
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }
}

class MyThread2 implements Runnable{
    Thread thrd;
    TickTock ttOb;

    MyThread2(String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0){
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
                ttOb.tock(false);
            }
        }
        else {
            for (int i = 0; i < 5; i++) {
                ttOb.tock(true);
                ttOb.tick(false);
            }
        }
    }
}

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread2 mt1 = new MyThread2("Tick", tt);
        MyThread2 mt2 = new MyThread2("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
