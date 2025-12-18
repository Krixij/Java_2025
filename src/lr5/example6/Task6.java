package lr5.example6;

public class Task6 {
    private int min;
    private int max;

    public void setValue(int a, int b) {
        int tempMax = this.max;
        int tempMin = this.min;
        this.max = Math.max(Math.max(tempMax, tempMin), Math.max(a, b));
        this.min = Math.min(Math.min(tempMax, tempMin), Math.min(a, b));
    }

    public void setValue(int a) {
        int tempMax = this.max;
        int tempMin = this.min;
        this.max = Math.max(Math.max(tempMax, tempMin), a);
        this.min = Math.min(Math.min(tempMax, tempMin), a);
    }
    public Task6 (int a, int b){
        if (a > b){
            this.max = a;
            this.min = b;
        } else {
            this.max = b;
            this.min = a;
        }

    }
    public Task6 (int a){
        this.max = a;
        this.min = a;
    }

    public void showValue() {
        System.out.println("Макс число: " + max + "; " + "Мин число " + min);
    }
}
