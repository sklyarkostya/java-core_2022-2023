package Codewars;
import java.util.Arrays;

public class Array_plus_array8 {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}
