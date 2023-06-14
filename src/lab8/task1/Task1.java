package lab8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("house");
            doc.appendChild(rootElement);

            Element animal1 = doc.createElement("animal");
            rootElement.appendChild(animal1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Персик"));
            animal1.appendChild(name1);

            Element kind1 = doc.createElement("kind");
            kind1.appendChild(doc.createTextNode("Кот"));
            animal1.appendChild(kind1);

            Element breed1 = doc.createElement("breed");
            breed1.appendChild(doc.createTextNode("Британская"));
            animal1.appendChild(breed1);

            Element animal2 = doc.createElement("animal");
            rootElement.appendChild(animal2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Джек"));
            animal2.appendChild(name2);

            Element kind2 = doc.createElement("kind");
            kind2.appendChild(doc.createTextNode("Собака"));
            animal2.appendChild(kind2);

            Element breed2 = doc.createElement("breed");
            breed2.appendChild(doc.createTextNode("Хаски"));
            animal2.appendChild(breed2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new StreamResult(
                    new File("src/lab8/task1/animal.xml")
            );
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
