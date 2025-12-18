package lr5.example2;

public class Task2 {
    public char ch1;
    public char ch2;

    public void showSymbol() {
        if (ch1 < ch2) {
            for (char i = ch1; i <= ch2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = ch2; i <= ch1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
