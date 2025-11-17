package lr2;

import java.util.Scanner;

/*
Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: при делении на 5 в остатке
получается 2, а при делении на 7 в остатке получается 1
 */

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int a = in.nextInt();
        int remainder_5 = a % 5;
        int remainder_7 = a % 7;
        if (remainder_5 == 2 && remainder_7 == 1){
            System.out.println("Введенное число удовлетворяет критериям");
        } else {
            System.out.println("Введенное число неудовлетворяет критериям");
        }
        in.close();
    }
}
