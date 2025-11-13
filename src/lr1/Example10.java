package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой по году рождения определяется возраст
пользователя.
 */

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи свой год рождения:");
        int year = in.nextInt();
        int a = 2025;
        if (year < a && year >= 0){
            int age = a - year;
            System.out.println("Твой возраст: " + age);
        } else if (a == year) {
            System.out.println("Тебе еще нет полных лет\n");
        } else if (year < 0){
            System.out.println("Такого года не существует\n");
        } else {
            System.out.println("Ты написал год рождения, который еще не наступил\n");
        }
        in.close();
    }
}
