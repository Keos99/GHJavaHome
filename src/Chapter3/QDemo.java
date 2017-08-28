package Chapter3;

class Queue {
    char q[];           //массив для хранения элементов очереди
    int putloc;         //индекс для вставки элемента в очередь
    int getloc;         //индекс для извлечения элемента из очереди

    Queue(int size){
        q = new char[size + 1]; //выделить память для очереди
        putloc = getloc = 0;
    }

    //Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length-1){
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    char get(){
        if (getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для сохранения алфавита");

        //поместить буквенные символы в очередь bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        //извлечь буквенные символы из осереди bigQ и отобразить
        System.out.print("Содержание очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использованиеочереди smallQ для генерации ошибок");
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохрания " + (char) ('Z' - i));
            smallQ.put((char)('z' - i));
            System.out.println();
        }

        System.out.println();

        //дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for (i = 0; i < 5 ; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
