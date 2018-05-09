package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW3.src;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница","Суббота","Воскресенье",
                          "Понедельник", "Вторник", "Среда", "Четверг", "Пятница","Суббота","Воскресенье",
                          "Понедельник", "Вторник", "Среда", "Четверг", "Пятница","Суббота","Воскресенье",};

        HashMap yelowpages = new HashMap<Long,String>();
        yelowpages.put(8495123456789L, "Петров");
        yelowpages.put(8495987654321L, "Иванов");
        yelowpages.put(8495111111111L, "Сидоров");
        yelowpages.put(8495222222222L, "Чеботарев");
        yelowpages.put(8495333333333L, "Петров");
        yelowpages.put(8495444444444L, "Чеботарев");
        yelowpages.put(8495555555555L, "Сидоров");
        yelowpages.put(8495666666666L, "Петров");
        yelowpages.put(8495777777777L, "Иванов");
        yelowpages.put(8495888888888L, "Петров");


        ArrayCommand arrayCommand = new ArrayCommand();
        YelowPages yelowPages = new YelowPages(yelowpages);

        arrayCommand.getUniqueWordsAndCount(words);
        System.out.println();
        //yelowPages.showYelowPages();
        //System.out.println();
        yelowPages.add(84993332211L,"Синицина");
        yelowPages.showYelowPages();
        System.out.println();
        yelowPages.get("Петров");
    }
}
