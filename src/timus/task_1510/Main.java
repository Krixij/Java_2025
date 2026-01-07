package timus.task_1510;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int count = 0;
        for (int i = 0; i < N; i++){
            int k = sc.nextInt();
            if (count == 0){
                result = k;
            }
            if(result == k){
                count++;
            }else {
                count--;
            }
        }
        System.out.println(result);
    }
}
