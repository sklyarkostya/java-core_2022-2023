package lab3;

import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 4000000; i++) {
            arrayList.add(i);
        }

        TreeSet treeSet = new TreeSet<>();
        for (int i = 0; i < 4000000; i++) {
            treeSet.add(i);
        }

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        for (int i = 0; i < 4000000; i++) {
            linkedHashMap.put(i, ""+i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(0, i);;
        }
        System.out.println("Время выполнения операции добавления элемента в начало ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(4000000+i);
        }
        System.out.println("Время выполнения операции добавления элемента в конец ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(4000000+i, i);
        }
        System.out.println("Время выполнения операции добавления элемента в середину ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            treeSet.add(4000000+i);
        }
        System.out.println("Время выполнения операции добавления элемента в TreeSet = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 4000000; i < 4020000; i++) {
            linkedHashMap.put(i, ""+i);
        }
        System.out.println("Время выполнения операции добавления элемента в LinkedHashMap = " + (System.currentTimeMillis() - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в начале ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 3999999; i > 3979999; i--) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в конце ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 2000000; i < 2050000; i++) {
            arrayList.remove(2000000);
        }
        System.out.println("Время выполнения операции удаления элемента в середине ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linkedHashMap.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в LinkedHashMap = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            treeSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в TreeSet = " + (System.currentTimeMillis() - startTime));

        for (int i = 4000000; i < 10000000; i++) {
            arrayList.add(i);
        }

        for (int i = 4000000; i < 10000000; i++) {
            treeSet.add(i);
        }

        for (int i = 4000000; i < 10000000; i++) {
            linkedHashMap.put(i, ""+i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.get(i);
        }
        System.out.println("Время выполнения операции получения элемента по индексу ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            treeSet.iterator().next();
        }
        System.out.println("Время выполнения операции получения элемента по индексу LinkedHashMap = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        Iterator<String> iterator = treeSet.iterator();
        for (int i = 0; i < 50000; i++) {
            iterator.next();
        }
        System.out.println("Время выполнения операции получения элемента по индексу TreeSet = " + (System.currentTimeMillis() - startTime));

        Random random = new Random(2);
        int i;
        for ( i = 0; i < 4_000_000; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            treeSet.add(value);
            linkedHashMap.put(value, "" + value);
        }

        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (i = 0; i < 50_000; i++) {
            arrayList.get(random.nextInt(4_000_000));
        }
        System.out.printf("[ArrayList] Получение по индексу = %d ms\n", System.currentTimeMillis() - startTime);

        System.out.println();

        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (i = 0; i < 50_000; i++) {
            treeSet.contains(random.nextInt(4_000_000));
        }
        System.out.printf("[TreeSet] Получение по индексу = %d ms\n", System.currentTimeMillis() - startTime);

        System.out.println();

        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (i = 0; i < 50_000; i++) {
            linkedHashMap.get(random.nextInt(4_000_000));
        }
        System.out.printf("[LinkedHashMap] Получение по индексу = %d ms \n", System.currentTimeMillis() - startTime);

        System.out.println();
    }
}
