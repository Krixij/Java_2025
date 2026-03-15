package lr9;

import java.util.Scanner;

/*
Создать приложение с использованием рекурсии для перевода
целого числа, введенного с клавиатуры, в двоичную систему счисления.
 */

public class Example7 {
    public static String binarySys(int num) {
        if(num < 2){
            return String.valueOf(num);
        } else {
            return binarySys(num / 2) + (num % 2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Число в двоичной системе:");
        System.out.println(binarySys(num));
    }
}
