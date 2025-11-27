package lr3;

import java.util.Scanner;


/*
Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).
 */

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа (через пробел):");
        int a = in.nextInt();
        int b = in.nextInt();
        int maxNumber = Math.max(a, b);
        int minNumber = Math.min(a, b);
        System.out.println("Вариант вывода через цикл for:");
        for (int i = minNumber; i <= maxNumber; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nВариант вывода через цикл while:");
        int num = minNumber;
        while (maxNumber >= num){
            System.out.print(num + " ");
            num += 1;
        }
        num = minNumber;
        System.out.println("\nВариант вывода через цикл do-while:");
        do {
            System.out.print(num + " ");
            num += 1;
        } while (maxNumber >= num);
        in.close();
    }
}
