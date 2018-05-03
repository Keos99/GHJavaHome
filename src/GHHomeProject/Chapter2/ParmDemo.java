package GHHomeProject.Chapter1.Chapter2;

class ChkNum {
    boolean isEven(int x) {
        if ((x%2) == 0) return true;
        else return false;
    }
}

public class ParmDemo {
    public static void main(String[] args) {
        ChkNum cn = new ChkNum();

        if (cn.isEven(10)) System.out.println("10 - четное число");
        if (cn.isEven(9)) System.out.println("9 - четное число");
        if (cn.isEven(8)) System.out.println("8 - четное число");
    }
}
