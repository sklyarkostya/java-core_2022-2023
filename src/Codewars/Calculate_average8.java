package Codewars;

import java.util.Arrays;

public class Calculate_average8 {
    public static double find_average(int[] array){
        int sum = Arrays.stream(array).sum();
        double average = (double) sum / array.length;
        return average;
    }
}
