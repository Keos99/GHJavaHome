package GHHomeProject.Chapter1;

public class DWDemo {
    public static void main(String[] args) throws java.io.IOException {

        char ch;

        do {
            System.out.println("Нажмите нужную клавишу, а затем клавишу <ENTER>");
            ch = (char) System.in.read();
        }while (ch !='q');
    }
}
