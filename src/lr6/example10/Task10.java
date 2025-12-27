package lr6.example10;

public class Task10 {
    public static int[] getMatrix(int... number){
        int min = number[0];
        int max = number[0];
        for (int num : number){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        int[] matrix = {min, max};
        return matrix;
    }
}
