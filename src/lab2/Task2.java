package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int k = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество строк");
        int line = sc.nextInt();

        System.out.println("Введите количество столбцов");
        int column = sc.nextInt();

        int[][] twoDimArray = new int[line][column];

        for (int i = 0; i < line; i++){
            if (i % 2 == 0){
                for (int j = 0; j < column; j++){
                    twoDimArray[i][j] = k;
                    k++;
                }
            } else {
                for (int j = column - 1; j >= 0; j--){
                    twoDimArray[i][j] = k;
                    k++;
                }
            }
        }

        for (int i = 0; i < twoDimArray.length; i++){
            for (int j = 0; j < twoDimArray[i].length; j++){
                System.out.print(twoDimArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
