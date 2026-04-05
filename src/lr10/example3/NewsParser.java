package lr10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        try {
            //Получаем HTML-код страницы

            //Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            Document doc = Jsoup.connect("https://www.uisi.ru/uisi/general/news.php").get();

            //Извлекаем список новостей

            /*
            Elements newsParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
             */

            Elements newsParent = doc.select(".news-list");

            //Выводим последние 10 новостей в консоль

            /*for (int i = 3; i < 20; i++){
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    System.out.println("Тема : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));
                    System.out.println("Дата : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) +
                            "\n");
                }
            }
             */

            Elements newsItem = newsParent.select(".news-item");

            for (int i = 0; i < newsItem.size() && i < 10; i++){
                Element news = newsItem.get(i);
                Element blockDate = news.selectFirst(".news-date-time");
                Element blockTitle = news.selectFirst(" a");
                System.out.println("\nТема: " + blockTitle.text());
                System.out.println("Дата: " + blockDate.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
