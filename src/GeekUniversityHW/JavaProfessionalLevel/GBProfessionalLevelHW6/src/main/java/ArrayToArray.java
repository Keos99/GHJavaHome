package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW6.src.main.java;

import java.util.Arrays;

public class ArrayToArray {

    public int[] toArrayAfterFour(int[] array){
        int[] arrayafter;
        int point = 0;
        boolean havefour = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4){
                point = i + 1;
                havefour = true;
            }
        }

        if (!havefour){
            throw new RuntimeException();
        }

        arrayafter = Arrays.copyOfRange(array,point,array.length);

        return arrayafter;
    }

    public boolean isContainsOneOrFour(int[] array){
        if (isContainsOne(array) || isContainsFour(array)){
            return true;
        } else {
            return false;
        }
    }

    public boolean isContainsOne(int[] array){
        boolean isone = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                isone = true;
            }
        }
        return isone;
    }

    public boolean isContainsFour(int[] array){
        boolean isfour = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4){
                isfour = true;
            }
        }
        return isfour;
    }
}
