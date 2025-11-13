package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой по возрасту определяется год рождения.
 */

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи свой возраст:");
        int age = in.nextInt();
        int a = 2025;
        if (age < 0 || age > a){
            System.out.println("Что-то не так\n");
        } else {
            int year = a - age;
            System.out.println("Ты родился в " + year + " году\n");
        }
        in.close();
    }
}
