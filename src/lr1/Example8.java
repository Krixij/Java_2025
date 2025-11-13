package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой Пользователь последовательно вводит
название текущего дня недели, название месяца и дату (номер дня в месяце).
Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).
 */

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи сегодняшнее название дня недели:");
        String dayWeek = in.nextLine();

        System.out.println("Введи название месяца:");
        String month = in.nextLine();

        System.out.println("Введи сегодняшнюю дату(число):");
        int day = in.nextInt();


        System.out.printf("Сегодня %s, Дата: %d, Месяц: %s\n", dayWeek, day, month);
        in.close();

    }
}

/*
Пометка: Если вдруг nextLine() будет после nextТип(), то можно написать перед nextLine() строку очистки буфера
in.nextLine();
Т.к. после nextТип используется символ новой строки (\n).
 */