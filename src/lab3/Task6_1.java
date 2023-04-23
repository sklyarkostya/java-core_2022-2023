package lab3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        int count = 0;
        Iterator iterator = arrayList.iterator();

        while (arrayList.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                count++;
                if (count == 2) {
                    iterator.remove();
                    count = 0;
                    System.out.println(arrayList);
                }
            } else {
                iterator = arrayList.iterator();
            }
        }
        System.out.println("Время выполнения операции = " + (System.currentTimeMillis() - start));
    }
}
