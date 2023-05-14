package lab5;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task6 {
    static int[] array = {0, 1, 2, 3, 4, 5, 6};
    static class MyThread extends Thread {
        public MyThread(String s) {
            super(s);
        }

        @Override
        public synchronized void run() {
            int sum = Arrays.stream(array).sum();
            System.out.println(sum);
            this.interrupt();
        }

        public static void main(String[] args) {
            for(int i=1; i < 6; i++)
                new Task5.MyThread("Thread " + i).start();
        }
    }
}
