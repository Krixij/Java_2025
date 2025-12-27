package lr6.example5;

public class Task5 {
    public static int getSumSquares(int num){
        int sumSquares = 0;
        for (int i = 1; i <= num; i++){
            sumSquares += i * i;
        }
        return sumSquares;
    }
}
