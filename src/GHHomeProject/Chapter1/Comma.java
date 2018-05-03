package GHHomeProject.Chapter1;

public class Comma {

    // Применение зяпятых в операторе цикда for

    public static void main(String[] args) {
        int i;
        int j;

        for (i=0, j=10; i < j; i++, j--){
            System.out.println("i и j: " + i + " " + j);
        }
    }
}
