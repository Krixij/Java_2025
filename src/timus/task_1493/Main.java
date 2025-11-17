package timus.task_1493;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b, c, d = 0;
        a = num / 100000 + (num / 10000) % 10 + (num / 1000) % 10;
        b = (num / 100) % 10 + (num / 10) % 10 + num % 10;
        c = ((num + 1) / 100) % 10 + ((num + 1) / 10) % 10 + (num + 1) % 10;
        d = ((num - 1) / 100) % 10 + ((num - 1) / 10) % 10 + (num - 1) % 10;
        if ((a - b == 1 || b - a == 1) && (a == c || a == d)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
