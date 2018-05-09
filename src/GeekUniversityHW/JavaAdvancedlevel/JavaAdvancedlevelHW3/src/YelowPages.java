package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW3.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class YelowPages {
    Map <Long,String> yelowpages = new HashMap<>();

    public YelowPages(HashMap yelowpages) {
        this.yelowpages = yelowpages;
    }

    public void showYelowPages(){
        for (Map.Entry<Long,String> entry : yelowpages.entrySet()){
            System.out.println("Фамилия = " + entry.getValue() + ", телефон " + entry.getKey());
        }
    }

    public void add(long number, String secondname ){
        yelowpages.put(number,secondname);
    }

    public void get(String secondname){
        ArrayList<Long> numbers = new ArrayList<>();

        for (Map.Entry<Long,String> entry : yelowpages.entrySet()){
            if (secondname.equals (entry.getValue())){
                numbers.add(entry.getKey());
            }
        }

        System.out.println("Товарищу " + secondname + " принадлежат номера: ");

        for (Long number :
                numbers) {
            System.out.println(number);
        }
    }


}
