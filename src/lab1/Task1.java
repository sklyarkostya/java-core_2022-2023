package lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию:");
        String fname = scanner.nextLine();

        System.out.println("Введите имя:");
        String sname = scanner.nextLine();

        System.out.println("Введите отчество:");
        String thname = scanner.nextLine();

        System.out.printf("Hello, %s %s %s \n", fname, sname, thname);
        scanner.close();
    }
}
