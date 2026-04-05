package lr10.example6;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Element;

import java.util.List;


public class MyJsonParser {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Найти книгу");
            System.out.println("3. Удалить книгу");
            System.out.println("4. Вывод файла");

            int choice = in.nextInt();
            in.nextLine();
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("D:\\Программирование/lr10/example6/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            switch (choice) {
                case 1:
                    JSONObject newBook = new JSONObject();
                    System.out.println("Введите название книги:");
                    String title = in.nextLine();
                    newBook.put("title", title);

                    System.out.println("Введите автора:");
                    String author = in.nextLine();
                    newBook.put("author", author);

                    System.out.println("Введите год издания:");
                    String year = in.nextLine();
                    newBook.put("year", year);
                    jsonArray.add(newBook);

                    try (FileWriter writer = new FileWriter("D:\\Программирование/lr10/example6/example-json.json")) {
                        writer.write(jsonObject.toJSONString());
                        writer.flush();
                        System.out.println("JSON файл успешно сохранен");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Напишите автора:");
                    String authorSearch = in.nextLine();
                    List<JSONObject> searchBooks = new java.util.ArrayList<>();

                    for (Object o: jsonArray){
                        if(o instanceof JSONObject){
                            JSONObject book = (JSONObject) o;
                            String bookAuthor = (String) book.get("author");
                            if (authorSearch.equals(bookAuthor)){
                                searchBooks.add(book);
                            }
                        }
                    }

                    if (searchBooks.isEmpty()) {
                        System.out.println("Книги не найдены");
                    } else {
                        searchBooks.forEach(book -> {
                            System.out.println("\nТекущий элемент: book");
                            System.out.println("Название книги: " + book.get("title"));
                            System.out.println("Автор: " + book.get("author"));
                            System.out.println("Год издания: " + book.get("year"));
                        });
                    }
                    break;
                case 3:
                    System.out.println("Напишите название книги для удаления:");
                    String titleDelete = in.nextLine();
                    Iterator iterator = jsonArray.iterator();
                    boolean deleteFlag = false;
                    while (iterator.hasNext()) {
                        JSONObject book = (JSONObject) iterator.next();
                        if (titleDelete.equals(book.get("title"))) {
                            iterator.remove();
                            deleteFlag = true;
                            System.out.println("Книга удалена");
                        }}
                    if (!deleteFlag){
                        System.out.println("Книга не найдена");
                    } else {
                        try (FileWriter writer = new FileWriter("D:\\Программирование/lr10/example6/example-json.json")) {
                            writer.write(jsonObject.toJSONString());
                            writer.flush();
                            System.out.println("JSON файл успешно сохранен");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Корневой элемент: "
                            + jsonObject.keySet().iterator().next());


                    for (Object o : jsonArray) {
                        JSONObject book = (JSONObject) o;
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Автор: " + book.get("author"));
                        System.out.println("Год издания: " + book.get("year"));
                    }
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
