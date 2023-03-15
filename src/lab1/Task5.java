package lab1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год рождения:");
        int age = 2023 - sc.nextInt();

        System.out.printf("Ваш возраст: %d \n", age);
        sc.close();
    }
}
