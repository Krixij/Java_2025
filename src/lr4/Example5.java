package lr4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
Напишите программу, в которой создается двумерный
целочисленный массив. Он заполняется случайными числами. Затем
в этом массиве строки и столбцы меняются местами: первая строка
становится первым столбцом, вторая строка становиться вторым
столбцом и так далее. Например, если исходный массив состоял из 3
строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3
столбцов.
*/
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи количество строк:");
        int stroke = in.nextInt();
        System.out.println("Введи количество столбцов");
        int column = in.nextInt();
        int i;
        int j;
        int[][] massive = new int[stroke][column];
        int[][] transposedMassive = new int[column][stroke];
        Random random = new Random();
        for (i = 0; i < stroke; i++){
            for (j = 0; j < column; j++){
                massive[i][j] = random.nextInt(200);
            }
        }
        System.out.println("Вывод массива:\n");
        System.out.println(Arrays.deepToString(massive) + "\n");
        for (i = 0; i < stroke; i++) {
            for (j = 0; j < column; j++) {
                System.out.printf("%s ", massive[i][j]);
            }
            System.out.println();
        }

        for (i = 0; i < stroke; i++){
            for (j = 0; j < column; j++){
                transposedMassive[j][i] = massive[i][j];
            }
        }
        System.out.println("\nВывод транспонированный массив:\n");
        System.out.println(Arrays.deepToString(transposedMassive)+ "\n");
        for (i = 0; i < column; i++) {
            for (j = 0; j < stroke; j++) {
                System.out.printf("%s ", transposedMassive[i][j]);
            }
            System.out.println();
        }
    }
}
