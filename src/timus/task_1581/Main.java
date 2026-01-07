package timus.task_1581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int temp = 0;
        int b = 0;
        for (int i = 0; i < N; i++){
            int a = sc.nextInt();
            if (b != a){
                temp++;
                b = a;
            }
            num[i] = a;
        }
        int[] num2 = new int[temp * 2];
        int count = 0;
        int value = num[0];
        int g = 0;
        for (int i = 0; i < N; i++){
            if (value == num[i]) {
                count++;
            } else {
                num2[g] = count;
                g++;
                num2[g] = value;
                g++;
                value = num[i];
                count = 1;
            }
            if (i == N - 1) {
                num2[g] = count;
                g++;
                num2[g] = value;
            }
        }
        for (int i = 0; i < temp * 2; i++){
            System.out.print(num2[i] + " ");
        }
    }
}
