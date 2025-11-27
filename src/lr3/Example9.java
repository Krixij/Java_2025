package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
 */

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи размер массива:");
        int size = in.nextInt();
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(nums));
        int min = 201;
        for (int i = 0; i < nums.length; i++){
            if (min > nums[i]){
                min = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (min == nums[i]){
                System.out.println("Элемент массива ["+i+"] имеет минимальное значение - " + nums[i]);
            }
        }
        in.close();
    }
}
