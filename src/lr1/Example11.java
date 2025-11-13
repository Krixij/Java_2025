package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой Пользователь вводит имя и год рождения, в
программа отображает сообщение содержащее имя пользователя и его
возраст.
 */

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи свое имя");
        String name = in.nextLine();

        System.out.println("Введи свой год рождения:");
        int year = in.nextInt();
        int a = 2025;
        if (year < a && year >= 0){
            int age = a - year;
            System.out.printf("Тебя зовут: %s\nТвой возраст: %d\n", name, age);
        } else if (a == year) {
            System.out.printf("Тебя зовут: %s\nТебе еще нет полных лет\n", name);
        } else if (year < 0) {
            System.out.printf("Тебя зовут: %s\nТакого года не существует\n", name);
        } else {
            System.out.printf("Тебя зовут: %s\nТы написал год рождения, который еще не наступил\n", name);
        }
        in.close();
    }
}
