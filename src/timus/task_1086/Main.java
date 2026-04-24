package timus.task_1086;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < k; i++){
            int a = in.nextInt();
            num.add(a);
        }
        int maxNum = num.get(0);
        for (int i = 1; i < k; i++){
            if (maxNum < num.get(i)){
                maxNum = num.get(i);
            }
        }
        List<Integer> numSimple = listSimpleNumbers(maxNum);
        for (int i = 0; i < k; i++){
            System.out.println(numSimple.get(num.get(i) - 1));

        }
    }
    public static List<Integer> listSimpleNumbers(int maxNum){
        List<Integer> numsSimple = new ArrayList<>();
        int num = 2;

        while (numsSimple.size() < maxNum){
            if (funMaxNum(num)){
                numsSimple.add(num);
            }
            num++;
        }
        return numsSimple;
    }
    public static boolean funMaxNum(int n){
        if (n < 2) {
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0){
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
