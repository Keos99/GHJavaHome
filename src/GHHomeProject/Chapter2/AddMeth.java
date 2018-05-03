package GHHomeProject.Chapter1.Chapter2;

class Vehicle99997 {
    int passengers;
    int fuelcap;
    int mpq;

    void range(){
        System.out.println("Дальность - " + fuelcap * mpq + " миль.");
    }
}

public class AddMeth {
    public static void main(String[] args) {
        Vehicle99997 minivan = new Vehicle99997();
        Vehicle99997 sportcar = new Vehicle99997();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpq = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpq = 12;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров.");

        minivan.range();

        System.out.println("Спорткар может перевезти " + sportcar.passengers + " пассажиров.");

        sportcar.range();
    }
}
