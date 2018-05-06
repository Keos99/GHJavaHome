public class MyThread implements Runnable {

    Thread thread;
    Color color;

    MyThread(String name, Color color) {
        thread = new Thread(this, name);
        this.color = color;
        thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("green") == 0) {
            try {
                color.green(true);
                color.yellow(false);
                color.red(false);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (thread.getName().compareTo("yellow") == 0) {
            try {
                color.green(false);
                color.yellow(true);
                color.red(false);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (thread.getName().compareTo("red") == 0) {
            try {
                color.green(false);
                color.yellow(false);
                color.red(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
