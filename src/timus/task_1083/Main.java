package timus.task_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String k = in.nextLine();
        int num = k.length() - 1;
        int result = 1;
        for (int i = n; i >= 1;){
            result *= i;
            i -= num;
        }
        System.out.println(result);
    }
}
