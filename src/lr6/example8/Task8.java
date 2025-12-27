package lr6.example8;

public class Task8 {
    public static double getAverageNum(int[] numbers){
        double sum = 0;
        double averageNum;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        averageNum = sum / numbers.length;
        return averageNum;
    }
}
