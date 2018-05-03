package GHHomeProject.Chapter4;

public class VarArgs3 {
    static void varArgsTest(int ... array){
        System.out.println("varArgsTest(int ...): " + "\nКоличество аргументов: " + array.length);
        System.out.println("Солержимое: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(" arg " + i + ": " + array[i]);
        }
        System.out.println();
    }
    static void varArgsTest(boolean ...array){
        System.out.println("varArgsTest(boolean ...)" + "\nКоличество аргументов: " + array.length);
        System.out.println("Содержит: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(" arg " + i + ": " + array[i]);
        }
        System.out.println();
    }
    static void varArgsTest(String msg, int ...array){
        System.out.println("varArgsTest(String, int ...)" + "\nКоличество аргументов: " + array.length);
        System.out.println("Содержит: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(" arg " + i + ": " + array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varArgsTest(1,2,3);
        varArgsTest(true, false,false);
        varArgsTest("Тестирование: ", 10, 20);
    }
}
