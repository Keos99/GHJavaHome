package GeekUniversityHW.JavaProfessionalLevel.GBProfessionalLevelHW1.src;

import java.util.ArrayList;
import java.util.Collections;

public class TestGeneric<T> {
    private T[] obj;
    ArrayList<T> myArrayList = new ArrayList<>();

    public TestGeneric(T[] obj){
        this.obj = obj;
    }

    public void changeTwoElements(int firstelement, int secontelement){
        T firstE;
        T secondE;

        if (obj.length < 2){
            System.out.println("Массив менее двух элементов!");
            System.out.println();
            return;
        } else if (firstelement > obj.length-1 | secontelement > obj.length-1){
            System.out.println("Значения элементов выходят за границы представленного массива!");
            System.out.println();
            return;
        }

        firstE = obj[firstelement];
        secondE = obj[secontelement];

        obj[firstelement] = secondE;
        obj[secontelement] = firstE;
        showArray();
    }

    public void showArray (){
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i] + " ");
        }
        System.out.println();
    }

    public void toArrayList(){
        Collections.addAll(myArrayList,obj);
    }

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,8,9,10};
        String[] strings = {"1","2","3","4","5"};
        Double[] doubles = {1.1,2.2,3.3,4.4,5.5};

        TestGeneric <Integer> testGenericInteger = new TestGeneric<>(integers);
        testGenericInteger.changeTwoElements(3,6);
        testGenericInteger.toArrayList();

        TestGeneric<String> testGenericString = new TestGeneric<>(strings);
        testGenericString.changeTwoElements(2,4);

        TestGeneric<Double> testGenericDouble = new TestGeneric<>(doubles);
        testGenericDouble.changeTwoElements(1,4);
    }
}
