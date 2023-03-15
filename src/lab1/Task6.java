package lab1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = sc.nextLine();

        System.out.println("Введите год рождения:");
        int year = 2023 - sc.nextInt();

        System.out.printf("Пользователь: %s \nВозраст: %d", name, year);
        sc.close();
    }
}
