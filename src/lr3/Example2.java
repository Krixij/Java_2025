package lr3;

import java.util.Scanner;

/*
Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
 */

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название недели (на русском и с заглавной буквы):");
        String day = in.nextLine();
        System.out.println("Вывод с помощью switch:");
        switch (day){
            case ("Понедельник"):
                System.out.println("Это дню соответсвует порядковый номер - 1");
                break;
            case ("Вторник"):
                System.out.println("Это дню соответсвует порядковый номер - 2");
                break;
            case ("Среда"):
                System.out.println("Это дню соответсвует порядковый номер - 3");
                break;
            case ("Четверг"):
                System.out.println("Это дню соответсвует порядковый номер - 4");
                break;
            case ("Пятница"):
                System.out.println("Это дню соответсвует порядковый номер - 5");
                break;
            case ("Суббота"):
                System.out.println("Это дню соответсвует порядковый номер - 6");
                break;
            case ("Воскресенье"):
                System.out.println("Это дню соответсвует порядковый номер - 7");
                break;
            default:
                System.out.println("Такого дня не существует");
                break;
        }
        System.out.println("\nВывод с помощью if-else if-else: ");
        String monday = "Понедельник";
        String tuesday = "Вторник";
        String wednesday = "Среда";
        String thursday = "Четверг";
        String friday = "Пятница";
        String saturday = "Суббота";
        String sunday = "Воскресенье";

         if (day.equals(monday)){
             System.out.println("Это дню соответсвует порядковый номер - 1");
         } else if (day.equals(tuesday)) {
             System.out.println("Это дню соответсвует порядковый номер - 2");
         } else if (day.equals(wednesday)) {
             System.out.println("Это дню соответсвует порядковый номер - 3");
         } else if (day.equals(thursday)) {
             System.out.println("Это дню соответсвует порядковый номер - 4");
         } else if (day.equals(friday)) {
             System.out.println("Это дню соответсвует порядковый номер - 5");
         } else if (day.equals(saturday)) {
             System.out.println("Это дню соответсвует порядковый номер - 6");
         } else if (day.equals(sunday)) {
             System.out.println("Это дню соответсвует порядковый номер - 7");
         } else {
             System.out.println("Такого дня не существует");
         }
        in.close();
    }
}
