package lr2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа).
 */

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = in.nextInt();
        int result = a / 1000;
        int numberThousands = result % 10;
        if (a < 1000){
            System.out.println("Введенное число меньше тысячи, следовательно тысяч и цифра тысяч будет равна 0\n");
        } else{
            System.out.printf("В введенном числе %s тысяч\nЦифра тысяч равна %s\n", result, numberThousands);
        }
        in.close();
    }
}
