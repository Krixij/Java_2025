package timus.task_1192;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int a = in.nextInt();
        double K = in.nextDouble();
        double pi = 3.1415926535;
        double S = 0;
        S = (V * V * Math.sin(2 * a * pi / 180))/(10 * (1 - (1 / K)));
        System.out.printf("%.2f", S);
    }
}
