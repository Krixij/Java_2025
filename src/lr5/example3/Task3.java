package lr5.example3;

public class Task3 {
    public int a;
    public int b;

    public Task3() {
    }

    public Task3(int a) {
        this.a = a;
    }
    public Task3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void showValue() {
        System.out.println(a + " " + b);
    }
}
