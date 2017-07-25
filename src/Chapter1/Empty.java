package Chapter1;

public class Empty {

    //Пропуск отдельных составляющих в определении цикла for

    public static void main(String[] args) {
        int i;

        for (i=0;i<10; ){
            System.out.println("Проход № " + i);
            i++;
        }
    }
}
