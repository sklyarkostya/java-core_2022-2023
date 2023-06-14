package lab8.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AnimalSearch {
    public static void findAnimalByName(String name) {
        try {
            FileReader reader = new FileReader("src/lab8/task2/animal.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject house = (JSONObject) jsonParser.parse(reader);
            JSONArray animals = (JSONArray) house.get("animals");

            for (int i = 0; i < animals.size(); i++) {
                JSONObject animal = (JSONObject) animals.get(i);
                if (animal.get("name").equals(name)) {
                    System.out.println("Животное найдено:");
                    System.out.println("Имя животного: " + animal.get("name"));
                    System.out.println("Вид животного: " + animal.get("kind"));
                    System.out.println("Порода животного: " + animal.get("breed"));
                    return;
                }
            }

            System.out.println("Животное с именем \"" + name + "\" не найдено.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного, которое хотите найти: ");
        String name = scanner.nextLine();

        AnimalSearch.findAnimalByName(name);
    }
}
