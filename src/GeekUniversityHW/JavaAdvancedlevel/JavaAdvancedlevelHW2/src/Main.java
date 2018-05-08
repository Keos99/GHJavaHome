package GeekUniversityHW.JavaAdvancedlevel.JavaAdvancedlevelHW2.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperationsOnArrays operationsOnArrays = new OperationsOnArrays();
        Scanner scanner = new Scanner(System.in);

        int menu;
        boolean repeat = true;
        String[][] cells4 = new String[4][4];
        String[][] cells8 = new String[8][8];

        do {
            menu = getMenu(scanner);

            switch (menu) {
                case 1:
                    repeat = array4x4(operationsOnArrays, cells4);
                    break;
                case 2:
                    array8x8(operationsOnArrays, cells8);
                    break;
                default:
                    System.out.println("Вы ввели неверный пункт меню, повторите ввод!");
                    break;
            }
        } while (repeat);
    }

    private static void array8x8(OperationsOnArrays operationsOnArrays, String[][] cells8) {
        operationsOnArrays.arrayInit(cells8);
        //operationsOnArrays.showArray(cells8);
        try {
            operationsOnArrays.sumAllCells(cells8);
        } catch (MySizeArrayException e) {
            System.err.println(e);
        }
    }

    private static boolean array4x4(OperationsOnArrays operationsOnArrays, String[][] cells4) {
        boolean repeat;
        operationsOnArrays.arrayInit(cells4);
        try {
            operationsOnArrays.sumAllCells(cells4);
        } catch (MySizeArrayException e) {
            System.err.println(e);
        }
        //operationsOnArrays.showArray(cells4);
        repeat = false;
        return repeat;
    }

    private static int getMenu(Scanner scanner) {
        int menu;
        System.out.println("Какой массив хотите обработать:");
        System.out.println("\t1) 4x4");
        System.out.println("\t2) 8x8");
        menu = scanner.nextInt();
        return menu;
    }
}
