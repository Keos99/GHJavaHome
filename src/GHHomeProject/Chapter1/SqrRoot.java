package GHHomeProject.Chapter1;

public class SqrRoot {

    //Вывод квадратных корней чисел от 1 до 99
    //вместе с ошибкой округления

    public static void main(String[] args) {
        double num;
        double sroot;
        double rerr;

        for (num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен " + sroot);

            //Вычислить ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
