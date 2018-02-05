package Chapter4;

class Factorial {
    int factR(int n){
        int result;

        if (n == 1) {
            return 1;
        }
        result = factR(n-1) * n;
        return result;
    }

    int factI(int n){
        int t;
        int result;

        result = 1;
        for (t = 1; t <= n; t++){
            result *= t;
        }
        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println("Вычисление рекурсивным методом");
        System.out.println("Факториал 3 равен " + factorial.factR(3));
        System.out.println("Факториал 4 равен " + factorial.factR(4));
        System.out.println("Факториал 5 равен " + factorial.factR(5));
        System.out.println();

        System.out.println("Вычисление интеративным методом");
        System.out.println("Факториал 3 равен " + factorial.factI(3));
        System.out.println("Факториал 4 равен " + factorial.factI(4));
        System.out.println("Факториал 5 равен " + factorial.factI(5));
    }
}
