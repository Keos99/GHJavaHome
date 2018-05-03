package GHHomeProject.Chapter4;

class StaticMeth{
    static int value = 1024;

    static int valueDiv2(){
        return value/2;
    }
}

public class SDemo2 {
    public static void main(String[] args) {
        System.out.println("Значение value: " + StaticMeth.value);
        System.out.println("StaticMeth.valueDiv2(): " + StaticMeth.valueDiv2());

        StaticMeth.value = 4;
        System.out.println("Значение value: " + StaticMeth.value);
        System.out.println("StaticMeth.valueDiv2(): " + StaticMeth.valueDiv2());
    }
}
