package Chapter4;

public class FailSoftArray {
    private int array[];
    private int errval;

    public int lenght;

    public FailSoftArray (int size, int errval) {
        this.array = new int[size];
        this.errval = errval;
        this.lenght = size;
    }

    public int get(int index){
        if (indexOK(index)){
            return array[index];
        } else {
            return errval;
        }
    }

    public boolean put (int index, int val){
        if (indexOK(index)){
            array[index] = val;
            return true;
        } else {
            return false;
        }
    }

    private boolean indexOK(int index){
        if (index >= 0 & index < lenght) {
            return true;
        } else {
            return false;
        }
    }
}

class FSDemo {
    public static void main(String[] args) {
        FailSoftArray failSoftArray = new FailSoftArray(5, -1);
        int x;

        System.out.println("Обработка ощибок без вывода отчета.");

        for (int i = 0; i < (failSoftArray.lenght * 2); i++) {
            failSoftArray.put(i, i*10);
        }

        for (int i = 0; i < (failSoftArray.lenght * 2); i++) {
            x = failSoftArray.get(i);

            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        System.out.println("\nОбработка ошибок с выводом отчета.");
        for (int i = 0; i < (failSoftArray.lenght * 2); i++) {
            if (!failSoftArray.put(i,i*10)){
                System.out.println("Индекс " + i + " вне допустимого диаппазона");
            }
        }

        for (int i = 0; i < (failSoftArray.lenght * 2); i++) {
            x = failSoftArray.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.println("Индекс " + i + " вне допустимого диапазона");
            }
        }
    }
}
