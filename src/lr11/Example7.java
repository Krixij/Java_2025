package lr11;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
7.	Напишите функцию, которая принимает на вход список строк
 и возвращает новый список, содержащий только те строки,
 которые имеют длину больше заданного значения.
 */
public class Example7 {
    public static void main(String[] args) {
        String string = "Котенок собака кот скукотища коттедж сырок отель дорого " +
                "скука язык котел тюлпан скот муха антибиотик кит трикотаж";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String s : strings){
            System.out.println(s);
        }
        Random random = new Random();
        int lengthWord = random.nextInt(10) + 1;
        System.out.println("\nЗаданная длина: " + lengthWord);
        List<String> stringsAfter = searchLengthWord (strings, lengthWord);
        System.out.println("\n" + "Строка после преобразовния: " + "\n");
        for (String s : stringsAfter){
            System.out.println(s);
        }
    }
    public static List<String> searchLengthWord(List<String> list, int lengthWord){
        return list.stream()
                .filter(s -> s.length() > lengthWord)
                .collect(Collectors.toList());
    }
}
