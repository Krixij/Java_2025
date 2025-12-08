package lr4;

import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный
числовой массив и этот массив заполняется «змейкой»: сначала
первая строка (слева направо), затем последний столбец (сверху
вниз), вторая строка (справа налево) и так далее,
 */

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи количество строк:");
        int stroke = in.nextInt();
        System.out.println("Введи количество столбцов");
        int column = in.nextInt();
        int i;
        int j;
        int [][] massive = new int [stroke][column];
        int a = 0;
        for (i = 0; i < stroke; i++){
            if (i % 2 == 0){
                for (j = 0; j < column; j++){
                    massive[i][j] = a;
                    a += 1;
                }
            } else {
                for (j = column - 1; j >= 0; j--){
                    massive[i][j] = a;
                    a += 1;
                }
            }
        }
        for (i = 0; i < stroke; i++){
            for (j = 0; j < column; j++){
                System.out.printf("%s ", massive[i][j]);
            }
            System.out.println();
        }
    }
}
