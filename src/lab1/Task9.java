package lab1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = sc.nextInt();
        int z = num - 1;
        int x = num + 1;
        int c = (int) Math.pow((num + z + x), 2);

        System.out.printf("%d %d %d %d", z, num, x, c);
        sc.close();
    }
}
