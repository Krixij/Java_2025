package timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a;
        int b;
        int c;
        int numDoubleA = 0;
        int numBreak = 0;
        int numB = 0;
        int numC = 0;
        for (int i = 1; i <= 100; i++){
            a = i;
            for (int j = 1; j <= 100; j++){
                b = a + j;
                for (int z = 1; z <= 100; z++){
                    c = b + z;
                    if (Math.pow(a, n) + Math.pow(b,n) == Math.pow(c, n)){
                        numDoubleA += 1;
                        if (numDoubleA == 1){
                            numC = c;
                        }
                    }
                }
                if (numDoubleA >= 1) {
                    numB = b;
                    numBreak = 1;
                    System.out.printf("%s %s %s", a, b, numC);
                    break;
                }

            }
            if (numBreak != 1){
                if (numDoubleA >= 1){
                    System.out.printf("%s %s %s", a, numB, numC);
                    break;
                }
            } else {
                break;
            }
        }
        if (numDoubleA < 1){
            System.out.println("-1");
        }
        in.close();
    }
}
