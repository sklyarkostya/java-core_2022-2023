package lab8.task2;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class Task2 {
    public static void main(String[] args) {
        JSONObject animal_tracker = new JSONObject();
        JSONArray animals = new JSONArray();

        JSONObject animal1 = new JSONObject();
        animal1.put("name", "Персик");
        animal1.put("kind", "Кот");
        animal1.put("breed", "Британский");

        JSONObject animal2 = new JSONObject();
        animal2.put("name", "Джек");
        animal2.put("kind", "Собака");
        animal2.put("breed", "Хаски");

        animals.add(animal1);
        animals.add(animal2);

        animal_tracker.put("animals", animals);

        try (FileWriter file = new FileWriter("src/lab8/task2/animal.json")) {
            file.write(animal_tracker.toJSONString());
            System.out.println("Json файл успешно создал!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
