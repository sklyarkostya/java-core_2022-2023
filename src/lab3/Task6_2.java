package lab3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        LinkedList linkedList = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        int count = 0;
        Iterator iterator = linkedList.iterator();

        while (linkedList.size() > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                count++;
                if (count == 2) {
                    iterator.remove();
                    count = 0;
                    System.out.println(linkedList);
                }
            } else {
                iterator = linkedList.iterator();
            }
        }
        System.out.println("Время выполнения операции = " + (System.currentTimeMillis() - start));
    }
}
