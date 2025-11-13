package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой пользователю предлагается ввести
название месяца и количество дней в этом месяце. Программа выводит
сообщение о том, что соответствующий месяц содержит указанное количество
дней.
 */


public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи номер месяца (Январь - 1; Февраль - 2; Март - 3 и тд):");
        int month = in.nextInt();

        System.out.println("Введи количество дней:");
        int day = in.nextInt();

        if (month == 1 && day == 31) {
            System.out.println("Январь содержит 31 день\n");
        } else if (month == 2 && (day == 28 || day == 29)) {
            System.out.println("Февраль содержит " + day + " день\n");
        } else if (month == 3 && day == 31) {
            System.out.println("Март содержит " + day + " день\n");
        } else if (month == 4 && day == 30) {
            System.out.println("Апрель содержит " + day + " день\n");
        } else if (month == 5 && day == 31) {
            System.out.println("Май содержит " + day + " день\n");
        } else if (month == 6 && day == 30) {
            System.out.println("Июнь содержит " + day + " день\n");
        } else if (month == 7 && day == 31) {
            System.out.println("Июль содержит " + day + " день\n");
        } else if (month == 8 && day == 31) {
            System.out.println("Август содержит " + day + " день\n");
        } else if (month == 9 && day == 30) {
            System.out.println("Сентябрь содержит " + day + " день\n");
        } else if (month == 10 && day == 31) {
            System.out.println("Октябрь содержит " + day + " день\n");
        } else if (month == 11 && day == 30) {
            System.out.println("Ноябрь содержит " + day + " день\n");
        } else if (month == 12 && day == 31) {
            System.out.println("Декабрь содержит " + day + " день\n");
        } else if ((month < 1 || month > 12) || (day < 1 || day > 31)) {
            System.out.println("Ошибка ввода");
        } else {
            System.out.println("Данный месяц не содержит столько дней");
        }
        in.close();
    }
}
