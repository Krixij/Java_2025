package timus.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int result = 0;
        if (c < a) {
            result = a;
        } else if (c < a + b){
            result = c;
        } else {
            while (a < c){
                if (c < a + b){
                    result = c;
                    break;
                } else {
                    a = a + b;
                    c = c - d;
                    result = a;
                }
            }
        }
        System.out.println(result);
        in.close();
    }
}
