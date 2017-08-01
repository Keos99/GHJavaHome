package Chapter2;

class Vechicle9999 {
    int passengers;
    int fuelcap;
    int mpq;
}

public class VechicleDemo {
    public static void main(String[] args) {
        Vechicle9999 minivan9999 = new Vechicle9999();
        int range;

        minivan9999.passengers = 7;
        minivan9999.fuelcap = 16;
        minivan9999.mpq = 21;

        range = minivan9999.fuelcap * minivan9999.mpq;
        System.out.println("Минифургон может перевезти " + minivan9999.passengers + " пассажиров на расстояние " + range + " миль.");
    }
}
