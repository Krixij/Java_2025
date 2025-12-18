package lr5.example4;

public class Task4 {
    public char ch;
    public int num;
    public Task4 (char ch, int num){
        this.ch = ch;
        this.num = num;
    }
    public Task4 (double num){
        this.ch = (char)((int)num);
        double temp = num - (int) num;
        this.num = (int)(temp * 100);
    }

    public void showValue() {
        System.out.println(ch + " " + num);
    }
}
