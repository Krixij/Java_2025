package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
6.	Напишите функцию, которая принимает на вход список
целых чисел и возвращает новый список,
содержащий только те числа, которые делятся на заданное число без остатка.
 */
public class Example6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("\n" + "Список до: " + "\n");
        for (int i = 0; i < 30; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        int num = random.nextInt(25);
        System.out.println("\nЗаданное число: " + num);
        List<Integer> integersAfter = divisionWithoutRemainder(integers, num);
        System.out.println("\n" + "Список чисел, которые делятся на num без остатка: " + "\n");

        for (Integer i : integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> divisionWithoutRemainder(List<Integer> list, int num){
        return list.stream()
                .filter(i -> num != 0 && i % num == 0)
                .collect(Collectors.toList());
    }
}
