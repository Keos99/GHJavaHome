package Chapter5;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int passengers, int fuelcap, int mpq){
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpq;
    }

    int range(){
        return mpg * fuelcap;
    }

    double fuelneeded(int miles){
        return (double) miles / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}

class Truck extends Vehicle{
    private int cargocap;

    Truck(int passengers, int fuelcap, int mpq, int cargocap){
        super(passengers, fuelcap, mpq);
        this.cargocap = cargocap;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Пикап может перевезти " + pickup.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.");
    }
}
