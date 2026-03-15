package lr9;

/*
Создать приложение, позволяющее ввести и вывести одномерный
массив целых чисел. Для ввода и вывода массива разработать рекурсивные
методы вместо циклов for.
 */

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        int index = 0;
        inputMatrix(array, index, in);
        in.close();
        System.out.println("Вывод массива: ");
        outputMatrix(array, index);
    }

    public static void inputMatrix(int[] array, int index, Scanner in) {

        if (array.length == index){
            return;
        } else {
            int num = in.nextInt();
            array[index] = num;
            inputMatrix(array, index + 1, in);
        }
    }

    public static void outputMatrix(int[] array, int index) {

        if (array.length == index){
            return;
        } else {
            System.out.print(array[index] + " ");
            outputMatrix(array, index + 1);
        }
    }
}
