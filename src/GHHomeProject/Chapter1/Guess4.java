package GHHomeProject.Chapter1;

public class Guess4 {

    public static void main(String[] args) throws java.io.IOException {
        char ch = 'S';
        char ignore = 'S';
        char answer = 'S';


        do {
            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.println("Попытайтесь её угадать: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore !='\n');

            if (ch == answer) System.out.println("**Правильно!**");
            else {
                System.out.println(".....Ихвините, нужная буква находится ");
                if (ch < answer){
                    System.out.println("ближе к началу алфавита");
                }
                else {
                    System.out.println("ближе к концу алфавита");
                }
                System.out.println("Повторите попытку!!!");
            }
        }while (answer !=ch);

    }
}
