package GHHomeProject.Chapter4;

class Summation{
    int sum;

    Summation(int num){
        sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
    }

    Summation(Summation summation){
        sum = summation.sum;
    }
}

public class SumDemo {
    public static void main(String[] args) {
        Summation summation1 = new Summation(5);
        Summation summation2 = new Summation(summation1);

        System.out.println("1" + summation1.sum);
        System.out.println("2" + summation2.sum);
    }
}
