package timus.task_1638;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int result = 0;
        if (d > c) {
            result = ((b * 2) + ((a + (b * 2)) * (d - c - 1)));
        } else {
            result = ((a + b) * 2 + ((a + (b * 2)) * (c - d - 1)));
        }
        System.out.println(result);
    }
}
