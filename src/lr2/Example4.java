package lr2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно.
 */

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = in.nextInt();
        if (a >= 5 && a <= 10){
            System.out.println("Введенное число находится в диапазоне от 5 до 10 включительно");
        } else {
            System.out.println("Введенное число не находится в диапазоне от 5 до 10 включительно");
        }
        in.close();
    }
}
