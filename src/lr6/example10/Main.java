package lr6.example10;

import java.util.Arrays;

/*
Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего значений среди
аргументов, переданных методу.
 */
public class Main {
    public static void main(String[] args) {
        int[] matrix = Task10.getMatrix(5,7,9,45,6,0,78,41);
        System.out.println(Arrays.toString(matrix));
        int[] matrixTwo = Task10.getMatrix(10,52,-2,65,94,31,1005);
        System.out.println(Arrays.toString(matrixTwo));
    }
}
