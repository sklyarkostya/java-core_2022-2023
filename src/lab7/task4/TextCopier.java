package lab7.task4;

import java.io.*;

public class TextCopier {
    public static void main(String[] args) {
        String testFile = "src/lab7/task4/test.txt";
        String finalTestFile = "src/lab7/task4/final-test.txt";

        try (var reader = new BufferedReader(new FileReader(testFile));
             var writer = new BufferedWriter(new FileWriter(finalTestFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
