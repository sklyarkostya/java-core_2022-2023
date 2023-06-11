package lab7.task4;

import java.io.*;

public class TextCopier {
    public static void main(String[] args) {
        String originFile = "src/lab7/task4/origin.txt";
        String finalFile = "src/lab7/task4/final.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(originFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(finalFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при копировании текста: " + e.getMessage());
        }
    }
}
