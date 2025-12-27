package lr6.example9;

public class Task9 {
    public static char[] getSwapChar(char[] ch){
        char temp;
        int n = ch.length / 2;
        for (int i = 0; i < n; i++) {
            temp = ch[ch.length - (1 + i)];
            ch[ch.length - (1 + i)] = ch[i];
            ch[i] = temp;
        }
        return ch;
    }
}
