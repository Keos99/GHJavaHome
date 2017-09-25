package Chapter3;

public class UpCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            ch = (char) ((int) ch & 65503);     // 1111111111011111

            System.out.println(ch + " ");
        }
    }
}
