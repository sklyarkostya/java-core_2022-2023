package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    static Scanner in = new Scanner(System.in);
    public static int count = 0;
    static int[] array;

    public static void fillArr() {
        if (count < array.length) {
            System.out.println("Введите число: ");
            int num = in.nextInt();
            array[count] = num;
            count++;
            fillArr();
        } else {
            System.out.println(Arrays.toString(array));
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите длину массива: ");
        int len = in.nextInt();
        array = new int[len];
        fillArr();
    }
}
