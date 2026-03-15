package timus.task_2012;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        if ((12 - f) <= 5){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
