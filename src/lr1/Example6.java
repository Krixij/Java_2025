package lr1;

import java.util.Scanner;


/*
Напишите программу, в которой Пользователь
вводит сначала фамилию,
затем имя, затем отчество.
После ввода программа выводит
сообщение «Hello
<фамилия, имя, отчество>».
 */


public class Example6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество");
        String middleName = in.nextLine();

        System.out.printf("Hello %s %s %s", surname, name, middleName);
        in.close();
    }
}
