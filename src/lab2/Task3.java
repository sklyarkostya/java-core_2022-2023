package lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String value = sc.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = sc.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        for (int i = 0; i < chars.length; i++){
            ints[i] = chars[i] + key;
        }

        for (int i = 0; i < chars.length; i++){
            chars[i] = (char)ints[i];
        }

        String string = new String(chars);
        System.out.println("Текст после преобразования: " + string);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = sc.nextLine();

        if (answer.equals("n")){
            System.out.println("До свидания!");
        } else if (answer.equals("y")) {

            for (int i = chars.length; i > 0; i --){
                ints[i] = chars[i] - key;
            }

            for (int i = chars.length; i > 0; i--){
                chars[i] = (char)ints[i];
            }
            String str = new String(chars);
            System.out.println("Обратное шифрование: " + str);
        } else {
            System.out.println("Введите корректный ответ");
        }

    }
}
