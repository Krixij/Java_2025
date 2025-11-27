package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */

public class Example10 {
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
        Arrays.sort(nums);
        System.out.print("[");
        for(int i = size - 1; i >= 0; i--){
            System.out.print(nums[i]);
            if (i > 0){
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
        in.close();
    }
}
