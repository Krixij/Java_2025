package lr6.example5;

import java.util.Scanner;

/*
Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + п^2.
Число п передается аргументом методу.
Для проверки результата можно использовать формулу 1^2 + 2^2 +3^2+…+n^2 =n(n+1)(2n + 1)/6
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int num = in.nextInt();
        int sumSquares = Task5.getSumSquares(num);
        System.out.println("Сумма квадратов: " + sumSquares);
        if (((num * (num + 1) * (2 * num + 1)) / 6) == sumSquares ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
