package lr3;

import java.util.Scanner;


/*
Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке
получается 2, или при делении на 3 в остатке получается 1 Количество чисел в
сумме вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.
 */

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел для суммы:");
        int num = in.nextInt();
        int sum = 0;
        int numberCondition = 0;
        System.out.println("Вариант вывода через цикл for:");
        for (int i = 0; numberCondition < num; i++){
            if (i % 5 == 2 || i % 3 == 1){
                System.out.print(i);
                sum += i;
                numberCondition += 1;
                if (numberCondition < num){
                    System.out.print(", ");
                }
            }
        }
        System.out.println("\nСумма равна " + sum);
        System.out.println("\nВариант вывода через цикл while:");
        sum = 0;
        numberCondition = 0;
        int a = 1;
        while (numberCondition < num){
            if (a % 5 == 2 || a % 3 == 1){
                System.out.print(a);
                sum += a;
                numberCondition += 1;
                if (numberCondition < num){
                    System.out.print(", ");
                }
            }
            a += 1;
        }
        System.out.println("\nСумма равна " + sum);
        System.out.println("\nВариант вывода через цикл do-while:");
        sum = 0;
        numberCondition = 0;
        a = 1;
        do {
            if (a % 5 == 2 || a % 3 == 1){
                System.out.print(a);
                sum += a;
                numberCondition += 1;
                if (numberCondition < num){
                    System.out.print(", ");
                }
            }
            a += 1;
        } while (numberCondition < num);
        System.out.println("\nСумма равна " + sum);
        in.close();
    }
}
