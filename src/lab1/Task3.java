package lab1;
import java.util.Date;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текущий день недели:");
        String day = sc.nextLine();

        System.out.println("Введите название текущего месяца:");
        String month = sc.nextLine();

        System.out.println("Введите текущий день в месяце:");
        int daymt = sc.nextInt();

        System.out.printf("Сегодня %s %d %s \n", day, daymt, month);
        sc.close();
    }
}
