package lr6.example3;

public class Task3 {
    public static int getMax(int... numbers){
        int max = numbers[0];
        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
    public static int getMin(int... numbers){
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static double getAverageNum(int... numbers){
        int count = 0;
        double averageNum = 0;
        for (int num : numbers) {
            count++;
            averageNum += num;
        }
        if (count != 0){
            averageNum = averageNum / count;
        }
        return averageNum;
    }
}
