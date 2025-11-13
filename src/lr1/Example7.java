package lr1;

import java.util.Scanner;

/*
Напишите программу, в которой Пользователь вводит имя и возраст.
Программа отображает сообщение об имени и возрасте пользователя.
 */


public class Example7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи имя:");
        String name = in.nextLine();

        System.out.println("Введи возраст:");
        int age = in.nextInt();

        System.out.printf("Имя пользователя: %s\nВозраст пользователя: %d \n", name, age);
        in.close();
    }
}
