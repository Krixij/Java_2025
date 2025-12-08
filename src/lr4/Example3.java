package lr4;


/*
Напишите программу, в которой создается двумерный массив,
который выводи прямоугольник из цифр 2;
 */

public class Example3 {
    public static void main(String[] args) {
        int size = 10;
        int i;
        int j;
        for (i = 1; i <= size; i++){
            System.out.print("|");
            for (j = 0; j < size; j++){
                System.out.print("2");
            }
            System.out.println("|");
        }
    }
}
