package timus.task_1731;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 1; j <= m; j++){
            System.out.print(j * (n + m) + " ");
        }
    }
}
