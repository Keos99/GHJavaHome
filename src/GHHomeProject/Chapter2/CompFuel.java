package GHHomeProject.Chapter2;

class Vehicle99995 {
    int passengers;
    int fuelcap;
    int mpq;

    int range(){
        return mpq * fuelcap;
    }

    double fuelneeded(int miles){
        return (double) miles/mpq;
    }
}

public class CompFuel {
    public static void main(String[] args) {
        Vehicle99995 mv = new Vehicle99995();
        Vehicle99995 sc = new Vehicle99995();
        double gallons;
        int dist = 252;

        mv.passengers = 7;
        mv.fuelcap = 16;
        mv.mpq = 21;

        sc.passengers = 2;
        sc.fuelcap = 14;
        sc.mpq = 12;

        gallons = mv.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + "галлонов топлива");

        gallons = sc.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спорткару требуется " + gallons + "галлонов топлива");
    }
}
