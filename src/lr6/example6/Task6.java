package lr6.example6;

public class Task6 {
    public static int[] getMatrix(int[] matrix, int num){
        if (num >= matrix.length){
            int[] matrixNew = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++){
                matrixNew[i] = matrix[i];
            }
            return matrixNew;
        } else {
            int[] matrixNew = new int[num];
            for (int i = 0; i < num; i++){
                matrixNew[i] = matrix[i];
            }
            return matrixNew;
        }
    }
}
