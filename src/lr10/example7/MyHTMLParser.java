package lr10.example7;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

import java.io.*;


public class MyHTMLParser {
    public static void main(String[] args) throws IOException, InterruptedException {
        File f1 = new File("News.txt");
        f1.createNewFile();
        PrintWriter out = null;
        try {
            out = new PrintWriter("D:\\Программирование\\Java_2025\\Java_2025\\News.txt", "cp1251");
            Document doc = null;
            int attempt = 0;
            int maxAttempts = 3;
            boolean connected = false;
            while(attempt < maxAttempts && !connected){
                try {
                    doc = Jsoup.connect("https://www.uisi.ru/uisi/general/news.php").get();
                    connected = true;
                } catch (IOException e){
                    attempt++;
                    System.out.println("Ошибка подключения.\nПовторное подключние: " + attempt + " из " + maxAttempts);
                    if (attempt < maxAttempts) {
                        Thread.sleep(2500);
                    }
                }
            }

            if (!connected){
                System.out.println("Не удалось подключиться");
                return;
            }

            Elements newsParent = doc.select(".news-list");
            Elements newsItem = newsParent.select(".news-item");
            for (int i = 0; i < newsItem.size() && i < 10; i++){
                Element news = newsItem.get(i);
                Element blockDate = news.selectFirst(".news-date-time");
                Element blockTitle = news.selectFirst(" a");
                out.println("Тема: " + blockTitle.text() + "\nДата: " + blockDate.text() + "\n");
                System.out.println("\nТема: " + blockTitle.text());
                System.out.println("Дата: " + blockDate.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.flush();
            out.close();
        }
    }
}
