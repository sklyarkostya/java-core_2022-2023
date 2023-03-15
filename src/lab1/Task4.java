package lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название месяца:");
        String month = sc.nextLine();

        System.out.println("Введите количество дней в месяце:");
        int day = sc.nextInt();

        System.out.printf("В %s - %d дней \n", month, day);
        sc.close();
    }
}
