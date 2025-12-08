package lr4;

/*
Напишите программу, которая выводит в консольное окно
прямоугольный треугольник;
 */

public class Example2 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        for (i = 1; i <= figure; i++){
            System.out.print("|");
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("\\");
        }
    }
}
