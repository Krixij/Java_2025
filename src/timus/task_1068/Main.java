package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0;
        if (N <= 0){
            do {
                result = result + N;
                N += 1;
            } while (N <= 1);
            System.out.println(result);
        } else{
            do {
                result = result + N;
                N -= 1;
            } while (N >= 1);
            System.out.println(result);
        }
        in.close();
    }
}
