package lab8.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AnimalRemove {
    public static void removeAnimalByName(String name) {
        try {
            FileReader reader = new FileReader("src/lab8/task2/animal.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject house = (JSONObject) jsonParser.parse(reader);
            JSONArray animals = (JSONArray) house.get("animals");

            for (int i = 0; i < animals.size(); i++) {
                JSONObject animal = (JSONObject) animals.get(i);
                if (animal.get("name").equals(name)) {
                    animals.remove(i);
                    System.out.println("Животное \"" + name + "\" успешно удалено из дома.");
                    break;
                }
            }

            house.put("animals", animals);
            FileWriter file = new FileWriter("src/lab8/task2/animal.json");
            file.write(house.toJSONString());
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного, которое хотите удалить:");
        String name = scanner.nextLine();

        AnimalRemove.removeAnimalByName(name);
    }
}
