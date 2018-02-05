package Chapter4;

class Queue{
    private char queuearray[];
    private int putlock;
    private int getlock;

    Queue(int size){
        queuearray = new char[size + 1];
        putlock = 0;
        getlock = 0;
    }

    Queue(Queue queue){
        putlock = queue.putlock;
        getlock = queue.getlock;
        queuearray = new char[queue.queuearray.length];

        for (int i=getlock+1; i <= putlock; i++){
            queuearray[i] = queue.queuearray[i];
        }
    }

    Queue(char chararray[]){
        putlock = 0;
        getlock = 0;
        queuearray = new char[chararray.length + 1];

        for (int i = 0; i < chararray.length; i++) {
            put(chararray[i]);
        }
    }

    void put (char ch){
        if (putlock == queuearray.length-1){
            System.out.println(" - Очередь заполнена");
            return;
        }
        putlock++;
        queuearray[putlock] = ch;
    }

    char get(){
        if (getlock == putlock){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getlock++;
        return queuearray[getlock];
    }
}

public class QDemo2 {
    public static void main(String[] args) {
        Queue queue1 = new Queue(10);

        char name[] = {'T','o','m'};
        Queue queue2 = new Queue(name);

        char ch;
        int i;

        for (int j = 0; j < 10; j++) {
            queue1.put((char)('A' + j));
        }

        Queue queue3 = new Queue(queue1);
        System.out.println("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = queue1.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = queue2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = queue3.get();
            System.out.print(ch);
        }
    }
}
