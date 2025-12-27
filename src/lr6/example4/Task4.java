package lr6.example4;

public class Task4 {
    public static int getFactorial(int num){
        int factorial = 1;
        if (num % 2 == 0){
           while (num > 0){
               factorial *= num;
               num -= 2;
           }
        } else {
            while (num > -1){
                factorial *= num;
                num -= 2;
            }
        }
        return factorial;
    }
}
