package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
10.	Напишите функцию, которая принимает на вход список
целых чисел и возвращает новый список, содержащий только те числа,
которые меньше заданного значения.
 */
public class Example10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n" + "Список до: " + "\n");
        for (int i = 0; i < 20; i++){
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }
        int num = random.nextInt(100);
        System.out.println("\nЗаданное число: " + num);
        List<Integer> integersAfter = searchNumbersLessNum(integers, num);
        System.out.println("\n" + "Список чисел, которые меньше, чем " + num + ":" + "\n");

        for (Integer i : integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> searchNumbersLessNum(List<Integer> list, int num){
        return list.stream()
                .filter(i -> i < num)
                .collect(Collectors.toList());
    }
}
