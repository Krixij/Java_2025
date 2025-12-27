package lr6.example1;

public class Task1 {
    private char ch;
    private String str;

    public void setValue(char ch) {
        this.ch = ch;
    }

    public void setValue(String str) {
        this.str = str;
    }

    public void setValue(char[] chars) {
        if (chars.length == 1){
            this.ch = chars[0];
        } else {
            this.str = new String(chars);
        }
    }

    public void showValue() {
        System.out.println("Символ: " + ch + "\nСтрока: " + str);
    }
}
