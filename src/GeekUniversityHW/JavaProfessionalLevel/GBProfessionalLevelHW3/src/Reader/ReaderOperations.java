package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW3.src.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class ReaderOperations {
    private final long PAGESIZE = 1800;
    private long booksize;
    private long pagesinbook;
    private int page;
    char[] letters2;
    int intforreadpage;

    public long getPagesInBook() {
        return pagesinbook;
    }

    public void readPage(BufferedReader BR){
        try {
            BR.read(letters2,(int)whatPage(), (int)PAGESIZE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getPage(String inputpage){
        page = Integer.parseInt(inputpage);
    }

    public long whatPage () {
        if (page == 1){
            return 0;
        } else if (page == 2){
            return PAGESIZE;
        } else {
            intforreadpage = (int) PAGESIZE * page;
            return intforreadpage;
        }
    }

    public void howManyPages(File file){
        booksize = file.length();
        letters2 = new char[(int) booksize];
        pagesinbook = booksize/PAGESIZE;
        System.out.println("В загруженной книге " + pagesinbook + " страниц.");
        System.out.println("Какую страницу хотите просмотреть?");
    }

    public void showPage () {
        for (int i = (int) whatPage(); i < whatPage() + 1800 ; i++) {
            if ((i == (whatPage() + 200)) || (i == (whatPage() + 400)) || (i == (whatPage() + 600)) ||
                    (i == (whatPage() + 800)) || (i == (whatPage() + 1000)) || (i == (whatPage() + 1200)) ||
                    (i == (whatPage() + 1400)) || (i == (whatPage() + 1600))){
                System.out.println();
            }
            System.out.print(letters2[i]);
        }
        System.out.println();
        System.out.println();
    }
}
