package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW3.src;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Operations {

    public void fileToArrayAndPrint(File file, FileInputStream fileInputStream){
        int[] array = new int[(int) file.length()];
        int x;
        try {
            for (int i = 0; i < file.length(); i++) {
                if ((x = fileInputStream.read()) != -1){
                    array[i] = x;
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) +") "+array[i] + " ");
        }
    }

    public void fiveFilesToOne (FileInputStream ... files) {
        ArrayList<InputStream> arrayList;
        FileOutputStream fileOS = null;
        Enumeration<InputStream> e;
        SequenceInputStream sequenceIS = null;

        try {
            arrayList = new ArrayList<>();
            fileOS = new FileOutputStream("src/GeekUniversityHW/JavaProfessionalLevel/GBProfessionalLevelHW3/1000.txt");

            for (int i = 0; i < files.length; i++) {
                arrayList.add(files[i]);
            }

            e = Collections.enumeration(arrayList);
            sequenceIS = new SequenceInputStream(e);

                int buffer;
                while ((buffer = sequenceIS.read()) != -1) {
                    fileOS.write(buffer);
                }
        } catch (IOException el){
            el.printStackTrace();
        } finally {
            try {
                fileOS.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                sequenceIS.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
