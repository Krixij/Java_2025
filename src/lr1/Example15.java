package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой Пользователь вводит два числа, а
программой вычисляется и отображается сумма и разность этих чисел.
 */

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи первое число:");
        int a = in.nextInt();

        System.out.println("Введи второе число");
        int b = in.nextInt();

        System.out.printf("Сумма введенных чисел равна %d\nРазность введенных чисел равна %d\n", a+b, a-b);
        in.close();
    }
}
