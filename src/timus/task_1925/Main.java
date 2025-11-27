package timus.task_1925;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sumB = k;
        int sumG = 0;
        int result = 0;
        for (int i = 1; i <= n; i++){
            int b = in.nextInt();
            int g = in.nextInt();
            sumB += b;
            sumG += g;
        }
        result = (sumB - sumG) - (n + 1) * 2;
        if (result >= 0){
            System.out.println(result);
        } else {
            System.out.println("Big Bang!");
        }
    }
}
