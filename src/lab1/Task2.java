package lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = sc.nextLine();

        System.out.println("Введите возраст:");
        int age = sc.nextInt();

        System.out.printf("Имя: %s Возраст: %d \n", name, age);
        sc.close();
    }
}
