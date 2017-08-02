package Chapter2;

class Vehicle{
    int passengers;
    int fuelcap;
    int mpq;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpq = m;
    }

    int ramge(){
        return mpq * fuelcap;
    }

    double fuelneeded(int miles){
        return (double) miles/mpq;
    }
}

public class VehConsDemo {
    public static void main(String[] args) {
        Vehicle mv = new Vehicle(7, 16, 21);
        Vehicle sc = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = mv.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sc.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спорткару требуется " + gallons + " галлонов топлива");
    }
}
