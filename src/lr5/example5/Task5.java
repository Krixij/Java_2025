package lr5.example5;

public class Task5 {
    private int num;

    public void setNum() {
        this.num = 0;
    }
    public void setNum(int num) {
        if (num > 100) {
            this.num = 100;
        } else {
            this.num = num;
        }
    }

    public Task5(int num){
        if (num > 100) {
            this.num = 100;
        } else {
            this.num = num;
        }
    }
    public Task5(){
        this.num = 0;
    }

    public void showValue() {
        System.out.println("Число: " + num);
    }
}
