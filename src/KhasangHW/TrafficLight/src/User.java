import java.util.Scanner;

public class User {

    Color color;
    Scanner scanner = new Scanner(System.in);

    void menu(Color color) {
        System.out.println("\tПо умолчанию, время работы светофора, установленно:");
        System.out.println("\t1) Зеленый цвет горит: " + color.getGreenTimeInSeconds() + " секунд.");
        System.out.println("\t2) Желтый цвет горит: " + color.getYellowTimeInSeconds() + " секунд.");
        System.out.println("\t3) Красный цвет горит: " + color.getRedTimeInSeconds() + " секунд.");
        System.out.println();
        System.out.println("\tХотите установить собственное время? (Введите 1 - да, 2 - нет)");
    }

    void menuChoice(Color color) {
        int choice;
        long greentimeinseconds;
        long yellowtimeinseconds;
        long redtimeinseconds;

        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("\tВведите время работы зеленого цвета светофора (в секундах): ");
            greentimeinseconds = scanner.nextLong();
            color.setGreentime(greentimeinseconds);
            System.out.println();
            System.out.print("\tВведите время работы жолтого цвета светофора (в секундах): ");
            yellowtimeinseconds = scanner.nextLong();
            color.setYellowtime(yellowtimeinseconds);
            System.out.println();
            System.out.print("\tВведите время работы красного цвета светофора (в секундах): ");
            redtimeinseconds = scanner.nextLong();
            color.setRedtime(redtimeinseconds);
            System.out.println();
            System.out.println("\tУстановлено время работы: ");
            System.out.println("\t1) Зеленый цвет горит: " + color.getGreenTimeInSeconds() + " секунд.");
            System.out.println("\t2) Желтый цвет горит: " + color.getYellowTimeInSeconds() + " секунд.");
            System.out.println("\t3) Красный цвет горит: " + color.getRedTimeInSeconds() + " секунд.");
            System.out.println();
        }
    }
}
