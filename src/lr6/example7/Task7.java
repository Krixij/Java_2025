package lr6.example7;

public class Task7 {
    public static int[] getCharToIntMatrix(char[] ch){
        int[] numbers = new int[ch.length];
        for (int i = 0; i < ch.length; i++){
            numbers[i] = (int) ch[i];
        }
        return numbers;
    }
}
