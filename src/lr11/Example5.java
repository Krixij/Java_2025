package lr11;

import java.util.List;
import java.util.stream.Collectors;

/*
5.	Напишите функцию, которая принимает на вход список строк
 и возвращает новый список, содержащий только те строки,
 которые содержат заданную подстроку.
 */
public class Example5 {
    public static void main(String[] args) {
        String string = "Котенок собака кот скукотища коттедж сырок отель дорого " +
                "скука язык котел тюлпан скот муха антибиотик кит трикотаж";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String s : strings){
            System.out.println(s);
        }
        String smallString = "кот";
        List<String> stringsAfter = searchStrings(strings, smallString);
        System.out.println("\n" + "Строка после преобразовния: " + "\n");
        for (String s : stringsAfter){
            System.out.println(s);
        }
    }

    public static List<String> searchStrings(List<String> list, String smallStrings){
        return list.stream()
                .filter(s -> s.toLowerCase().contains(smallStrings.toLowerCase()))
                .collect(Collectors.toList());
    }
}
