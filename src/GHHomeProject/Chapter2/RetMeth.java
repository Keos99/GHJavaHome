package GHHomeProject.Chapter1.Chapter2;

class Vehicle99996 {
    int passengers;
    int fuelcap;
    int mpq;

    int range(){
        return mpq*fuelcap;
    }
}

public class RetMeth {
    public static void main(String[] args) {
        Vehicle99996 mv = new Vehicle99996();
        Vehicle99996 sc = new Vehicle99996();

        int range;
        int range2;

        mv.passengers = 7;
        mv.fuelcap = 16;
        mv.mpq = 21;

        sc.passengers = 2;
        sc.fuelcap = 14;
        sc.mpq = 12;

        range = mv.range();
        range2 = sc.range();

        System.out.println("Мини-фургон может перевезти " + mv.passengers + " пассажиров.");
        System.out.println("Спорткар может перевезти " + sc.passengers + " пассажиров.");
    }
}
