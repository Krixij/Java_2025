package lr9;

/*
Вывести число Фибоначчи, заданное его номером в
последовательности.
 */

public class Example5 {

    public static void main(String[] args) {
        System.out.println("Результат: " + fact(5));
    }

    public static int fact(int n){

        System.out.println("fact(" + n + "):");
        int result;
        if (n == 0){
            result =  0;
            System.out.println("  fact(0) = 0");
        } else if (n == 1) {
            result =  1;
            System.out.println("  fact(1) = 1");
        } else {
            System.out.println(" fact(" + n + ") = fact(" + (n - 2) + ") + fact(" + (n - 1) + ")");

            System.out.println("  <- Левая ветка: fact(" + (n - 2) + ")");
            int left = fact(n - 2);

            System.out.println("  -> Правая ветка: fact(" + (n - 1) + ")");
            int right = fact(n - 1);

            result = left + right;
            System.out.println(" fact(" + n + ") = " + left + " + " + right + " = " + result);
        }
        System.out.println(" fact(" + n + ") вывод " + result);
        return result;
    }

}
