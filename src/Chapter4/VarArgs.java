package Chapter4;

public class VarArgs {
    static void varArgsTest (int ... v){
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varArgsTest(10);
        varArgsTest(1,2,3);
        varArgsTest();
    }
}
