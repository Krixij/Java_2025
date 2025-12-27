package timus.task_1197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] result = new int[N];
        in.nextLine();
        for (int i = 0; i < N; i++){
            String position = in.nextLine();
            String letter = position.replaceAll("[0-9]", "");
            String number = position.replaceAll("[^0-9]", "");
            if (number.equals("1") || number.equals("8")){
                if (letter.equals("a") || letter.equals("h")){
                    result[i] = 2;
                } else if (letter.equals("b") || letter.equals("g")){
                    result[i] = 3;
                } else {
                    result[i] = 4;
                }
            } else if (number.equals("2") || number.equals("7")) {
                if (letter.equals("a") || letter.equals("h")){
                    result[i] = 3;
                } else if (letter.equals("b") || letter.equals("g")) {
                    result[i] = 4;
                } else {
                    result[i] = 6;
                }
            } else {
                if (letter.equals("a") || letter.equals("h")){
                    result[i] = 4;
                } else if (letter.equals("b") || letter.equals("g")) {
                    result[i] = 6;
                } else {
                    result[i] = 8;
                }
            }
        }
        for(int i = 0; i < N; i++){
            System.out.println(result[i]);
        }
    }
}
