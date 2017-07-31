package Chapter1;

//Применение оператора break для выхода из цикла

public class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        // Выполнять цикл до тех пор, пока квадрат значения
        // переменной i меньше значения переменной num

        for (int i = 0; i < num; i++) {
            if (i * i >= num) break;
            System.out.print(i + " ");
        }
        System.out.print("Цикл завершен.");
    }
}
