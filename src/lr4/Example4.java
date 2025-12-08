package lr4;

/*
Напишите программу, в которой создается двумерный массив,
который выводит прямоугольный треугольник;
*/

public class Example4 {
    public static void main(String[] args) {
        int size = 10;
        char[][] massive = new char[size][];
        int i;
        int j;
        for (i = 0; i < size; i++){
            massive[i] = new char[i + 1];
            for (j = 0; j <= i; j++){
                massive[i][j] = '*';
            }
        }
        for (i = 0; i < massive.length; i++){
            System.out.print("|");
            for (j = 0; j < massive[i].length; j++){
                System.out.print(massive[i][j]);
            }
            System.out.println("\\");
        }
    }
}
