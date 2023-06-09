package lab8.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class LinkParser {
    public static void writeLinksToFile(String url, String fileName) {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            FileWriter writer = new FileWriter(fileName);
            for (Element link : links) {
                writer.write(link.attr("abs:href") + "\n");
            }
            writer.close();
            System.out.println("Ссылки успешно сохранены в файл!");
        } catch (IOException e) {
            System.err.println("Ошибка получения данных с сайта: " + url + ", попытка переподключиться");
            e.printStackTrace();
            writeLinksToFile(url, fileName);
        }
    }

    public static void main(String[] args) {
        LinkParser.writeLinksToFile("https://itlearn.ru/first-steps", "src/lab8/task3/links.txt");
    }
}
