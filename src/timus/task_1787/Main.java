package timus.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++){
            int a = in.nextInt();
            result = result + a - k;
            if (result < 0){
                result = 0;
            }
        }
        System.out.println(result);
    }
}
