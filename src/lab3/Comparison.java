package lab3;

import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet treeSet = new TreeSet<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        Random random = new Random(2);
        for (int i = 0; i < 4000000; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            treeSet.add(value);
            linkedHashMap.put(value, ""+value);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(0, i);;
        }
        System.out.println("Время выполнения операции добавления элемента в начало ArrayList : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(4000000+i);
        }
        System.out.println("Время выполнения операции добавления элемента в конец ArrayList : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.add(4000000+i, i);
        }
        System.out.println("Время выполнения операции добавления элемента в середину ArrayList : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            treeSet.add(4000000+i);
        }
        System.out.println("Время выполнения операции добавления элемента в TreeSet : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 4000000; i < 4050000; i++) {
            linkedHashMap.put(i, ""+i);
        }
        System.out.println("Время выполнения операции добавления элемента в LinkedHashMap : " + (System.currentTimeMillis() - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в начале ArrayList : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 4000000; i > 3959999; i--) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в конце ArrayList : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 4000000; i < 4050000; i++) {
            arrayList.remove(4000000);
        }
        System.out.println("Время выполнения операции удаления элемента в середине ArrayList : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linkedHashMap.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в LinkedHashMap : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            treeSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента в TreeSet : " + (System.currentTimeMillis() - startTime));

        random = new Random(2);
        for (int i = 0; i < 4000000; i++) {
            int value = random.nextInt();
            arrayList.add(value);
            treeSet.add(value);
            linkedHashMap.put(value, "" + value);
        }

        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            arrayList.get(random.nextInt(4000000));
        }
        System.out.printf("Время выполнения операции получения элемента по индексу ArrayList : ", System.currentTimeMillis() - startTime);

        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            treeSet.contains(random.nextInt(4000000));
        }
        System.out.printf("Время выполнения операции получения элемента по индексу TreeSet : ", System.currentTimeMillis() - startTime);

        random = new Random(2);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            linkedHashMap.get(random.nextInt(4000000));
        }
        System.out.printf("Время выполнения операции получения элемента по индексу LinkedHashMap : ", System.currentTimeMillis() - startTime);
    }
}
