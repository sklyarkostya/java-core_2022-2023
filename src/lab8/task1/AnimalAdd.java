package lab8.task1;
import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AnimalAdd {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lab8/task1/animal.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите имя животного: ");
            String name = scanner.nextLine();

            System.out.print("Введите вид животного: ");
            String kind = scanner.nextLine();

            System.out.print("Введите породу животного: ");
            String breed = scanner.nextLine();

            Element root = doc.getDocumentElement();

            Element animal = doc.createElement("animal");

            Element nameElement = doc.createElement("name");
            nameElement.appendChild(doc.createTextNode(name));
            animal.appendChild(nameElement);

            Element kindElement = doc.createElement("kind");
            kindElement.appendChild(doc.createTextNode(kind));
            animal.appendChild(kindElement);

            Element breedElement = doc.createElement("breed");
            breedElement.appendChild(doc.createTextNode(breed));
            animal.appendChild(breedElement);

            root.appendChild(animal);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lab8/task1/animal.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
