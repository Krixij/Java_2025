package lr3;

import java.util.Scanner;


/*
Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих (получается
последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество
чисел в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла.
 */

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напиши количества чисел в последовательности Фибоначчи:");
        int size = in.nextInt();
        System.out.println("Вариант вывода через цикл for:");
        int a = 0;
        int b = 0;
        int sum = 1;
        for (int i = 0; i < size; i++){
            a = sum;
            System.out.print(sum + " ");
            sum = a + b;
            b = a;
        }
        int sizeForWhile = size;
        a = 0;
        b = 0;
        sum = 1;
        System.out.println("\nВариант вывода через цикл while:");
        while (sizeForWhile > 0){
            a = sum;
            System.out.print(sum + " ");
            sum = a + b;
            b = a;
            sizeForWhile -= 1;
        }
        sizeForWhile = size;
        a = 0;
        b = 0;
        sum = 1;
        System.out.println("\nВариант вывода через цикл do-while:");
        do {
            a = sum;
            System.out.print(sum + " ");
            sum = a + b;
            b = a;
            sizeForWhile -= 1;
        } while (sizeForWhile > 0);
        in.close();
    }
}
