package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float result = 0;
        boolean grandNone = false;
        for (int i = 1; i <= n; i++){
            int m = in.nextInt();
            result = result + m;
            if (m == 3){
                grandNone = true;
            }
        }
        float averageScore = result / n;
        if (averageScore == 5){
            System.out.println("Named");
        } else if (averageScore >= 4.5 && averageScore < 5 && !grandNone) {
            System.out.println("High");
        } else if (averageScore < 4.5 && averageScore >= 4 && !grandNone){
            System.out.println("Common");
        } else if (grandNone) {
            System.out.println("None");
        } else {
            System.out.println("None");
        }
        in.close();
    }
}
