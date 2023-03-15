package lab1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        float fnum = sc.nextFloat();

        System.out.println("Введите второе число:");
        float snum = sc.nextFloat();

        System.out.printf("Сумма чисел: " + (fnum + snum));
        sc.close();
    }
}
