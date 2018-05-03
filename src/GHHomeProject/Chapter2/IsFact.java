package GHHomeProject.Chapter1.Chapter2;

class Factor {
   boolean isFactor (int a, int b) {
       if ((b % a) == 0) return true;
       else return false;
   }
}

public class IsFact {
    public static void main(String[] args) {
        Factor f = new Factor();

        if (f.isFactor(2, 20)) System.out.println("2 - делитель");
        if (f.isFactor(3, 20)) System.out.println("Эта строка не будет выведена!");
    }
}
