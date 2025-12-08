package timus.task_1585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int numEmperor = 0;
        int numMacaroni = 0;
        int numLittle = 0;
        for (int i = 0; i <= n; i++){
            String str = in.nextLine();
            if (str.equals("Emperor Penguin")){
                numEmperor++;
            } else if (str.equals("Little Penguin")) {
                numLittle++;
            } else if (str.equals("Macaroni Penguin")){
                numMacaroni++;
            }
        }
        if (numEmperor > numLittle && numEmperor > numMacaroni){
            System.out.println("Emperor Penguin");
        } else if (numLittle > numEmperor && numLittle > numMacaroni) {
            System.out.println("Little Penguin");
        } else if (numMacaroni > numEmperor && numMacaroni > numLittle){
            System.out.println("Macaroni Penguin");
        }
    }
}
