package lr4;

import java.util.Random;
import java.util.Scanner;


/*
Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется
строка и столбец (создается новый массив, в котором по сравнению с
исходным удалена одна строка и один столбец). Индекс удаляемой
строки и индекс удаляемого столбца определяется с помощью
генератора случайных чисел.
*/


public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи количество строк:");
        int stroke = in.nextInt();
        System.out.println("Введи количество столбцов");
        int column = in.nextInt();
        int i;
        int j;
        int [][] massive = new int [stroke][column];
        Random random = new Random();
        int deleteStroke = random.nextInt(stroke-1);
        int deleteColumn = random.nextInt(column-1);
        for (i = 0; i < stroke; i++){
            for (j = 0; j < column; j++){
                massive[i][j] = random.nextInt(200);
            }
        }
        for (i = 0; i < stroke; i++){
            for (j = 0; j < column; j++){
                System.out.printf("%s ", massive[i][j]);
            }
            System.out.println();
        }
        int a;
        int [][] secondMassive = new int [stroke - 1][column - 1];
        for (i = 0; i < stroke - 1; i++){
            a = 0;
            if (i == deleteStroke) {
                deleteStroke += 1;
                for (j = 0; j < column - 1; j++) {
                    if (j == deleteColumn + a){
                        a += 1;
                        secondMassive[i][j] = massive[deleteStroke][deleteColumn + a];
                    } else {
                        secondMassive[i][j] = massive[deleteStroke][j];
                    }
                }
            } else {
                for (j = 0; j < column - 1; j++) {
                    if (j == deleteColumn + a){

                        a += 1;
                        secondMassive[i][j] = massive[i][deleteColumn + a];
                    } else {
                        secondMassive[i][j] = massive[i][j];
                    }
                }
            }
        }
        System.out.println();
        for (i = 0; i < stroke - 1; i++){
            for (j = 0; j < column - 1; j++){
                System.out.printf("%s ", secondMassive[i][j]);
            }
            System.out.println();
        }
    }
}
