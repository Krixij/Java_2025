package timus.task_1120;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long S = in.nextLong();
        long sum;
        long max = (long) Math.sqrt(2 * S);
        for(long i = max; i > 0; i--){
            if ((2 * S) % i == 0 && (((2 * S) / i - i + 1) % 2 == 0)){
                long A = ((2 * S) / i - i + 1) / 2;
                if (A >= 1){
                    System.out.println(A + " " + i);
                    break;
                }
            }
        }
    }
}
