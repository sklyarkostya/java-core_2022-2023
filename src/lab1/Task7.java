package lab1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваш возраст:");
        int age = 2023 - sc.nextInt();
        System.out.printf("Ваш год рождения: %d", age);
        sc.close();
    }
}
