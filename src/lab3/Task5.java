package lab3;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, "string" + i);
        }
        for (int i : hashMap.keySet()) {
            if (i > 5) {
                System.out.println(hashMap.get(i));
            } else if (i == 0) {
                System.out.println(hashMap.values());
            }
        }
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i).length() > 5) {
                counter *= i;
            }
        }
        System.out.println(counter);
    }
}
