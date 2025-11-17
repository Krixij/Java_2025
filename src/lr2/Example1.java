package lr2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, делится ли введенное
Пользователем число на 3
 */


public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = in.nextInt();
        int result = a % 3;
        if (result == 0){
            System.out.println("Введенное число делится без остатка на три");
        } else {
            System.out.println("Введенное число не делится без остатка на три\n" + "Остаток равен " + result);
        }
        in.close();
    }
}
