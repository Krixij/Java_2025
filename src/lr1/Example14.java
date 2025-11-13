package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой пользователь вводит число, а программой
отображается последовательность из четырех чисел: число, на единицу
меньше введённого, введенное число и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.
 */

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи число: ");
        int a = in.nextInt();
        int b = a - 1;
        int c = a + 1;
        int d = (a + b + c) * (a + b + c);
        System.out.printf("Последовательность: %d, %d, %d, %d\n", b, a, c, d);
        in.close();
    }
}
