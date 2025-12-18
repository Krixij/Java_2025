package timus.task_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 1;
        int i = 1;
        int queue = 1;
        while (i < n){
            i++;
            if (queue == 1){
                if ((i + result) % 2 == 0){
                    result -= i;
                } else {
                    result += i;
                }
                queue = 0;
            } else {
                if ((i + result) % 2 == 0){
                    result += i;
                } else {
                    result -= i;
                }
                queue = 1;
            }

        }
        if (result % 2 == 0){
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }
    }
}
