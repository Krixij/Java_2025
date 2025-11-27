package timus.task_2025;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] result = new int[T];
        int sum = 0;
        int sumNo = 0;
        for (int i = 0; i < T; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            for (int j = 1; j < n; j++ ){
                sum += n - j;
            }
            if (n != k){
                for (int j = 1; j < n/k; j++){
                    sumNo += n/k - j;
                }
                sum = sum - sumNo * k - (n % k) * (n/k);
            }
            result[i] = sum;
            sum = 0;
            sumNo = 0;
        }
        for (int z = 0; z < T; z++){
            System.out.println(result[z]);
        }
        in.close();
    }
}
