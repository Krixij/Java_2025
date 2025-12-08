package timus.task_1712;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String codePart1 = in.nextLine();
        String codePart2 = in.nextLine();
        String codePart3 = in.nextLine();
        String codePart4 = in.nextLine();
        String textPart1 = in.nextLine();
        String textPart2 = in.nextLine();
        String textPart3 = in.nextLine();
        String textPart4 = in.nextLine();
        String code = codePart1 + codePart2 + codePart3 + codePart4;
        String text = textPart1 + textPart2 + textPart3 + textPart4;
        char[] arrayCode = code.toCharArray();
        char[] arrayText = text.toCharArray();
        String[][] massiveCode = new String[4][4];
        String[][] massiveText = new String[4][4];
        String[][] transportedCode = new String[4][4];
        StringBuilder pass = new StringBuilder();
        int num = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                massiveCode[i][j] = String.valueOf(arrayCode[num]);
                num += 1;
            }
        }
        num = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                massiveText[i][j] = String.valueOf(arrayText[num]);
                num += 1;
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (massiveCode[i][j].equals("X")){
                    pass.append(massiveText[i][j]);
                }
            }
        }
        for (int i = 0; i < 4; i++){
            int a = 0;
            for (int j = 3; j >= 0; j--){
                transportedCode[i][a] = massiveCode[j][i];
                a++;
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (transportedCode[i][j].equals("X")){
                    pass.append(massiveText[i][j]);
                }
            }
        }
        for (int i = 0; i < 4; i++){
            int a = 0;
            for (int j = 3; j >= 0; j--){
                massiveCode[i][a] = transportedCode[j][i];
                a++;
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (massiveCode[i][j].equals("X")){
                    pass.append(massiveText[i][j]);
                }
            }
        }
        for (int i = 0; i < 4; i++){
            int a = 0;
            for (int j = 3; j >= 0; j--){
                transportedCode[i][a] = massiveCode[j][i];
                a++;
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (transportedCode[i][j].equals("X")){
                    pass.append(massiveText[i][j]);
                }
            }
        }
        System.out.println(pass);
    }
}
