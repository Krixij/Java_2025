package lr6.example7;

import java.util.Arrays;

/*
Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива-аргумента.
 */
public class Main {
    public static void main(String[] args) {
        char[] ch = {'A', 'm', 'Y', 't', 'o', 'P'};
        int[] numbers = Task7.getCharToIntMatrix(ch);
        System.out.println(Arrays.toString(numbers));
    }
}
