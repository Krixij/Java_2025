package timus.task_1494;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] matrix = new int[N];
        for (int i = 0; i < N; i++){
            matrix[i] = in.nextInt();
        }
        int[] matrixCheck = new int[N];
        int top = -1;
        int nextBall = 1;
        int extractIndex = 0;
        while (nextBall <= N){
            matrixCheck[++top] = nextBall;
            nextBall++;

            while (top >= 0 && matrixCheck[top] == matrix[extractIndex]){
                top--;
                extractIndex++;
            }
        }
        if (extractIndex == N && top == -1){
            System.out.println("Not a proof");
        } else {
            System.out.println("Cheater");
        }
        in.close();
    }
}
