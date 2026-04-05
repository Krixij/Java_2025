package timus.task_1353;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int N = 1000000000;
        int[] matrix = new int[s + 1];
        matrix[0] = 1;
        for (int i = 0; i < 9; i++){
            int[] countMatrix = new int[s + 1];
            for (int j = 0; j <= s; j++){
                if (matrix[j] == 0){
                    continue;
                }
                for (int k = 0; k <= 9; k++){
                    int sum = j + k;
                    if (sum <= s){
                        countMatrix[sum] += matrix[j];
                    }
                }
            }
            matrix = countMatrix;
        }
        int result = matrix[s];
        if (s == 1){
            result++;
        }
        System.out.println(result);
    }
}
