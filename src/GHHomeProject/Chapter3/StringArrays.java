package GHHomeProject.Chapter3;

public class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"Эта", "строка","является","текстом."};

        System.out.println("Исходный массив: ");
        for (String s : strs) {
            System.out.println(s + " ");
        }
        System.out.println("\n");

        strs[2] = "так же является";
        strs[3] = "текстом!";

        System.out.println("Измененный массив");
        for (String s : strs) {
            System.out.println(s + " ");
        }
    }
}
