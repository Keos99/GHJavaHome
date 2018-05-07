package KhasangHW.TrafficLight.src;

public class TrafficLight {
    public static void main(String[] args) {
        Color color = new Color();
        User user = new User();

        user.menu(color);
        user.menuChoice(color);

        MyThread myThreadGreen = new MyThread("green", color);
        MyThread myThreadYellow = new MyThread("yellow", color);
        MyThread myThreadRed = new MyThread("red", color);

        try {
            myThreadGreen.thread.join();
            myThreadYellow.thread.join();
            myThreadRed.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
