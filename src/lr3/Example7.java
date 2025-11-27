package lr3;

/*
Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной.
 */

public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] massive = new char[size];
        char letter = 'a';
        System.out.print("[");
        for (int i = 0; i < size; i++){
            System.out.printf("'%c'",letter);
            massive[i] = letter;
            letter += 2;
            if (i < size - 1){
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
        System.out.print("\n[");
        for (int i = size - 1; i >= 0; i--){
            letter -= 2;
            System.out.printf("'%c'", letter);
            if (i > 0){
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
    }
}
