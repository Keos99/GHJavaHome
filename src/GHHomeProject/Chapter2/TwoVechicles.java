package GHHomeProject.Chapter2;

class Vechicle9998 {
    int passengers;
    int fuelcap;
    int mpq;
}

public class TwoVechicles {
    public static void main(String[] args) {


        Vechicle9998 minivan = new Vechicle9998();
        Vechicle9998 sportscar = new Vechicle9998();

        int range1;
        int range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpq = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpq = 12;

        range1 = minivan.fuelcap * minivan.mpq;
        range2 = sportscar.fuelcap * sportscar.mpq;

        System.out.println("Минифургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Минифургон может перевезти " + sportscar.passengers + " пассажиров на расстояние " + range2 + " миль.");
    }
}
