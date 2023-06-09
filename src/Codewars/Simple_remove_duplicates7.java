package Codewars;
import java.util.Map;
import java.util.HashMap;

public class Simple_remove_duplicates7 {
    public static int [] solve(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .mapToInt(e -> e.getKey())
                .toArray();
    }
}
