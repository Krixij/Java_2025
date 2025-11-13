package lr1;

import java.util.Scanner;

/*
Напишите программу для вычисления суммы двух чисел. Оба числа
вводятся пользователем. Для вычисления суммы используйте оператор +.
 */

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи первое число");
        int a = in.nextInt();

        System.out.println("Введи второе число");
        int b = in.nextInt();

        System.out.printf("Сумма введенных чисел равна %d\n", a+b);
        in.close();
    }
}
