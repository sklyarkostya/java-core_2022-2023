package lab8.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AnimalAdd {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab8/task2/animal.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("animals");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите имя животного: ");
            String name = scanner.nextLine();

            System.out.print("Введите вид животного: ");
            String kind = scanner.nextLine();

            System.out.print("Введите породу животного: ");
            String breed = scanner.nextLine();

            JSONObject newAnimal = new JSONObject();
            newAnimal.put("name", name);
            newAnimal.put("kind", kind);
            newAnimal.put("breed", breed);
            jsonArray.add(newAnimal);

            JSONObject house = new JSONObject();
            house.put("animals", jsonArray);

            try (FileWriter file = new FileWriter("src/lab8/task2/animal.json")) {
                file.write(house.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
