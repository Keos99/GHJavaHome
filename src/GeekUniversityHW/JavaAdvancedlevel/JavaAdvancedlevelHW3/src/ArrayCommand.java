package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW3.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayCommand {
    Map<String,Integer> wordscount = new HashMap<>();
    ArrayList<String> uniqwords = new ArrayList<>();

    public void getUniqueWordsAndCount(String[] array){
        for (int i = 0; i < array.length; i++) {
           if (uniqwords.contains(array[i])){
                continue;
            } else {
               uniqwords.add(array[i]);
           }
        }

        System.out.println("Уникальные слова: ");

        for (String str : uniqwords) {
            System.out.println("\t" + str);
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            String tempstring = array[i];

            if (!wordscount.containsKey(array[i])){
                wordscount.put(tempstring,1);
            } else {
                wordscount.put(tempstring, wordscount.get(tempstring)+1);
            }
        }

        for (Map.Entry<String,Integer> entry : wordscount.entrySet()){
            System.out.println("Слово = " + entry.getKey() + ", повторяется " + entry.getValue() + " раз");
        }
    }
}
