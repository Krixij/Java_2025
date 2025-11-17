package lr2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10
 */

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = in.nextInt();
        int result = a % 4;
        if (result == 0 && a >= 10){
            System.out.println("Введенное число удовлетворяет критериям");
        } else {
            System.out.println("Введенное число неудовлетворяет критериям");
        }
        in.close();
    }
}
