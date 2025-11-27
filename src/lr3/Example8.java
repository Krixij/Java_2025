package lr3;


/*
Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’ А ' , ' Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
 */

public class Example8 {
    public static void main(String[] args) {
        int size = 10;
        char[] massive = new char[size];
        char letter = 'A';
        System.out.print("[");
        for (int i = 0; i < size; i++){
            switch (letter){
                case ('A'):
                    letter += 1;
                    i -= 1;
                    continue;
                case ('E'):
                    letter += 1;
                    i -= 1;
                    continue;
                case ('I'):
                    letter += 1;
                    i -= 1;
                    continue;
                default:
                    System.out.printf("'%c'", letter);
                    letter += 1;
                    if (i < size - 1){
                        System.out.print(", ");
                    } else {
                        System.out.println("]");
                    }
            }
        }
    }
}
