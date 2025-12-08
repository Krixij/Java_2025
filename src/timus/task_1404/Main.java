package timus.task_1404;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] arrayAlphabet = alphabet.toCharArray();
        char[] arrayChar = text.toCharArray();
        char[] arrayCharNew = new char[arrayChar.length];
        int number = 5;
        int num;
        for (int i = 0; i < arrayChar.length; i++){
            char element = text.charAt(i);
            int index = alphabet.indexOf(element);
            if (i == 0 && (index >= 0 && index <= 4)){
                index += 26;
            } else if (i >= 1) {
                index += 26;
                while(index - number < 0){
                    index += 26;
                }
            }
            num = index;
            index -= number;
            number = num;

            arrayCharNew[i] = arrayAlphabet[index] ;
        }
        System.out.println(String.valueOf(arrayCharNew));
    }
}
