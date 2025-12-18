package timus.task_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        CurrentStep n = new CurrentStep();
        n.setN(in.nextInt());
        n.showStep();
    }
}
