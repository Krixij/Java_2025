package timus.task_1642;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] matrix = new int[n];
        for (int i = 0; i < n; i++){
            matrix[i] = in.nextInt();
        }
        int countStep = 0;
        for(int i = 0; i < n; i++){
            if (x < 0){
                if (x < matrix[i] && countStep > matrix[i]){
                    System.out.println("Impossible");
                    return;
                }
            } else {
                if (x > matrix[i] && countStep < matrix[i]){
                    System.out.println("Impossible");
                    return;
                }
            }
        }
        int positiveStep = 1;
        int negativeStep = -1;
        boolean count = false;
        int resultForward = 0;
        int resultBack = 0;
        while (x != countStep){
            for (int i = 0; i < n; i++){
                if (matrix[i] == countStep){
                    count = true;
                }
            }
            if (count == false){
                countStep += positiveStep;
            } else {
                countStep += negativeStep;
            }
            resultForward++;
        }
        countStep = 0;
        count = false;
        while (x != countStep){

            for (int i = 0; i < n; i++){
                if (matrix[i] == countStep){
                    count = true;
                }
            }
            if (count == true){
                countStep += positiveStep;
            } else {
                countStep += negativeStep;
            }
            resultBack++;
        }
        System.out.println(resultForward + " " + resultBack);
    }
}
