package lr10.example5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class MyXMLParser {
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

            File inputFile = new File("D:\\Программирование\\lr10\\example5/example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            NodeList nodeList = doc.getElementsByTagName("book");

            switch (choice) {
                case 1:
                    Element rootElement = doc.getDocumentElement();
                    Element book1 = doc.createElement("book");
                    rootElement.appendChild(book1);

                    Element title1 = doc.createElement("title");
                    System.out.println("Введите название книги:");
                    String title = in.nextLine();
                    title1.appendChild(doc.createTextNode(title));
                    book1.appendChild(title1);

                    Element author1 = doc.createElement("author");
                    System.out.println("Введите автора:");
                    String author = in.nextLine();
                    author1.appendChild(doc.createTextNode(author));
                    book1.appendChild(author1);

                    Element year1 = doc.createElement("year");
                    System.out.println("Введите год издания:");
                    String year = in.nextLine();
                    year1.appendChild(doc.createTextNode(year));
                    book1.appendChild(year1);

                    Transformer transformer =
                            TransformerFactory.newInstance().newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(new File("D:\\Программирование\\lr10\\example5/example.xml"));
                    transformer.transform(source, result);
                    System.out.println("\nКнига добавлена:");
                    System.out.println("Название: " + title);
                    System.out.println("Автор: " + author);
                    System.out.println("Год: " + year);
                    break;
                case 2:
                    System.out.println("Искать по: \n1 - автор, 2 - год");
                    int num = in.nextInt();
                    in.nextLine();
                    if (num == 1){
                        System.out.println("Напишите автора:");
                        String searchAuthor = in.nextLine();
                        List<Element> books = new ArrayList<>();
                        for (int i = 0; i < nodeList.getLength(); i++) {
                            Node node = nodeList.item(i);
                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element element = (Element) node;
                                String authorSearch = element.getElementsByTagName("author").item(0).getTextContent();
                                if (authorSearch.equalsIgnoreCase(searchAuthor)) {
                                    books.add(element);
                                }
                            }
                        }
                        if (books.isEmpty()) {
                            System.out.println("Книги не найдены");
                        } else {
                            System.out.println("Найденные книги:");
                            for (Element book : books) {
                                System.out.println("\nНазвание: " + book.getElementsByTagName("title").item(0).getTextContent());
                                System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
                                System.out.println("Год: " + book.getElementsByTagName("year").item(0).getTextContent());
                            }
                        }
                    } else if (num == 2) {
                        System.out.println("Напишите год:");
                        String searchYear = in.nextLine();
                        List<Element> books = new ArrayList<>();
                        for (int i = 0; i < nodeList.getLength(); i++) {
                            Node node = nodeList.item(i);
                            if (node.getNodeType() == Node.ELEMENT_NODE) {
                                Element element = (Element) node;
                                String yearSearch = element.getElementsByTagName("year").item(0).getTextContent();
                                if (yearSearch.equals(searchYear)) {
                                    books.add(element);
                                }
                            }
                        }
                        if (books.isEmpty()) {
                            System.out.println("Книги не найдены");
                        } else {
                            System.out.println("Найденные книги:");
                            for (Element book : books) {
                                System.out.println("\nНазвание: " + book.getElementsByTagName("title").item(0).getTextContent());
                                System.out.println("Автор: " + book.getElementsByTagName("author").item(0).getTextContent());
                                System.out.println("Год: " + book.getElementsByTagName("year").item(0).getTextContent());
                            }
                        }
                    } else {
                        System.out.println("Неверный ввод");
                    }
                    break;
                case 3:
                    System.out.println("Напишите название книги для удаления:");
                    String deleteTitle = in.nextLine();
                    Element bookElement = null;
                    for (int i = 0; i < nodeList.getLength(); i++) {
                        Node node = nodeList.item(i);
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element book = (Element) node;
                            String titleBook = book.getElementsByTagName("title").item(0).getTextContent();
                            if (titleBook.equalsIgnoreCase(deleteTitle)) {
                                bookElement = book;
                                break;
                            }
                        }
                    }

                    if (bookElement != null) {
                        Node parentNode = bookElement.getParentNode();
                        parentNode.removeChild(bookElement);
                        Transformer transformerDelete =
                                TransformerFactory.newInstance().newTransformer();
                        DOMSource sourceDelete = new DOMSource(doc);
                        StreamResult resultDelete = new StreamResult(new File("D:\\Программирование\\lr10\\example5/example.xml"));
                        transformerDelete.transform(sourceDelete, resultDelete);
                        System.out.println("Книга удалена");
                    } else {
                        System.out.println("Книга не найдена");
                    }

                    break;
                case 4:
                    doc.getDocumentElement().normalize();
                    System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
                    for (int i = 0; i < nodeList.getLength(); i++){
                        Node node = nodeList.item(i);
                        System.out.println("\nТекущий элемент: " + node.getNodeName());
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element element  = (Element) node;
                            System.out.println("Название книги: "
                                    + element.getElementsByTagName("title").item(0)
                                    .getTextContent());
                            System.out.println("Автор: "
                                    + element.getElementsByTagName("author").item(0)
                                    .getTextContent());
                            System.out.println("Год издания: "
                                    + element.getElementsByTagName("year").item(0)
                                    .getTextContent());
                        }
                    }
                    return;
                default:
                    System.out.println("Неверный выбор");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}