package lr3;

import java.util.Scanner;


/*
Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.
 */

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи размер массива:");
        int size = in.nextInt();
        if (size <= 0){
            System.out.println("Некорректный ввод значения");
        }
        int[] nums = new int[size];
        int numberCondition = 0;
        System.out.print("[");
        for (int i = 0; numberCondition < size; i++){
            if (i % 5 == 2){
                System.out.print(i);
                nums[numberCondition] = i;
                numberCondition += 1;
                if (numberCondition < size){
                    System.out.print(", ");
                } else {
                    System.out.println("]");
                }
            }
        }
        in.close();
    }
}
