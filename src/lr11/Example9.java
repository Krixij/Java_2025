package lr11;

import java.util.List;
import java.util.stream.Collectors;

/*
9.	Напишите функцию, которая принимает на вход список строк
и возвращает новый список, содержащий только те строки,
которые содержат только буквы (без цифр и символов).
 */
public class Example9 {
    public static void main(String[] args) {
        String string = "Котенок собака! кот 6скукотища коттедж сы7рок отел*ь дор95ого " +
                "скука5 язык котел тюлпан. скот му&ха антибиотик к!ит трикотаж";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String s : strings){
            System.out.println(s);
        }
        List<String> stringsAfter = searchWordsWithoutNumAndSymbols (strings);
        System.out.println("\n" + "Строка после преобразовния: " + "\n");
        for (String s : stringsAfter){
            System.out.println(s);
        }
    }
    public static List<String> searchWordsWithoutNumAndSymbols(List<String> list){
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-ЯёЁ]+"))
                .collect(Collectors.toList());
    }
}
