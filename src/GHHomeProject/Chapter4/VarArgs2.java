package GHHomeProject.Chapter4;

public class VarArgs2 {
    static void varArgsTest(String message, int ... array){
        System.out.println(message + array.length);
        System.out.println("Содердимое: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(" arg " + i + ": " + array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varArgsTest("Один аргумент в массиве: ", 10);
        varArgsTest("Три аргумента в массиве: ", 1,2,3);
        varArgsTest("Отсутствуют аргументы в виде массива: ");
    }
}
