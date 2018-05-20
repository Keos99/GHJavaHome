package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW3.src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            File file50 = new File("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/50.txt");
            FileInputStream fileInputStream50 = new FileInputStream("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/50.txt");
            FileInputStream fileIS1001 = new FileInputStream("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/100 (1).txt");
            FileInputStream fileIS1002 = new FileInputStream("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/100 (2).txt");
            FileInputStream fileIS1003 = new FileInputStream("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/100 (3).txt");
            FileInputStream fileIS1004 = new FileInputStream("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/100 (4).txt");
            FileInputStream fileIS1005 = new FileInputStream("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/100 (5).txt");

            operations.fileToArrayAndPrint(file50, fileInputStream50);
            operations.fiveFilesToOne(fileIS1001,fileIS1002,fileIS1003,fileIS1004,fileIS1005);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
