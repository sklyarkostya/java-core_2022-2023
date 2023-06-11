package lab7.task5;

import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Файл не найден");
            return;
        }
        long fileSize = file.length();
        System.out.println("Размер файла " + file.getName() + " составляет " + fileSize + " байт(а).");
    }
}
