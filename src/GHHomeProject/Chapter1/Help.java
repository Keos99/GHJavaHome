package GHHomeProject.Chapter1;

import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2, switch");
        System.out.println("Выберите: ");
        choice = scanner.nextInt();

        System.out.println("\n");

        switch(choice){
            case 1:
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case 2:
                System.out.println("Оператор switch:\n");
                System.out.println("switch(вырпжение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" //....");
                System.out.println("}");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
