package lr6.example9;

import java.util.Arrays;

/*
Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последним, второй — с предпоследним и так далее.
 */
public class Main {
    public static void main(String[] args) {
        char[] ch = {'F', 'r', 't', 'e', 'I', 'q'};
        char[] matrix = Task9.getSwapChar(ch);
        System.out.println(Arrays.toString(matrix));
        char[] ch1 = {'R', 'o', 't'};
        matrix = Task9.getSwapChar(ch1);
        System.out.println(Arrays.toString(matrix));
    }
}
