package lab1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа:");
        int fnum = sc.nextInt();
        int snum = sc.nextInt();

        System.out.printf("Сумма чисел: %d \nРазность чисел: %d", fnum + snum, Math.abs(fnum - snum));
        sc.close();
    }
}
