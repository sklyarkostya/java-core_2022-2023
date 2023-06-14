package lab8.task1;

import java.io.File;
import java.util.stream.IntStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.Scanner;
public class AnimalSearcher {
    public static void searchByName(String animal) {
        try {
            File inputFile = new File("src/lab8/task2/animal.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("animal");
            System.out.println("Список животных в доме " + animal + ":");

            IntStream.range(0, nodeList.getLength())
                    .mapToObj(nodeList::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> element
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent()
                            .equals(animal))
                    .forEach(element -> {
                        System.out.println("Имя животного: " + element
                                .getElementsByTagName("name")
                                .item(0)
                                .getTextContent());
                        System.out.println("Вид животного: " + element
                                .getElementsByTagName("kind")
                                .item(0)
                                .getTextContent());
                        System.out.println("Порода животного: " + element
                                .getElementsByTagName("breed")
                                .item(0)
                                .getTextContent());
                        System.out.println();
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя для поиска животного: ");
        String searchName = scanner.nextLine();
        searchByName(searchName);
    }
}
