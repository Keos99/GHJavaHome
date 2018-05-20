package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW3.src.Reader;

import java.io.*;

public class Main {
    private static ReaderOperations RO;
    private static File file;
    private static BufferedReader keyboard;
    private static String keyboardinput;
    private static int inputpage;
    private static BufferedReader bufferedR;

    public static void main(String[] args) {

        keyboard = new BufferedReader(new InputStreamReader(System.in));
        RO = new ReaderOperations();
        file = new File("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/Book1.txt");
        try {
            bufferedR = new BufferedReader(new FileReader("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/Book1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        RO.howManyPages(file);

        new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Введите страницу или /выход: ");
                    keyboardinput = keyboard.readLine();
                    inputpage = Integer.parseInt(keyboardinput);

                    if (keyboardinput.contains("/выход")) {
                        bufferedR.close();
                        keyboard.close();
                        return;
                    } else if (inputpage > RO.getPagesInBook()){
                        System.out.println("Такой страницы нет!");
                    } else {
                        RO.getPage(keyboardinput);
                        RO.readPage(bufferedR);
                        RO.showPage();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
