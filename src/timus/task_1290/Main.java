package timus.task_1290;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] matrix = new int[N];
        for (int i = 0; i < N; i++){
            matrix[i] = in.nextInt();
        }
        Arrays.sort(matrix);
        for (int i = N - 1; i >= 0; i--){
            System.out.println(matrix[i]);
        }
    }
}
