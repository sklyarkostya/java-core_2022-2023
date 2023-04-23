package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int number;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число для перевода: ");
        number = in.nextInt();
        convert(number);

    }

    public static void convert(int num) {
        if (num > 0) {
            convert(num / 2);
            System.out.print(num % 2 + " ");
        }
    }
}
