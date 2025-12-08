package lr4;



/*
Напишите программу, которая выводить в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки,
высота: 11 строк;
 */

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;
        for (i = 1; i <= figure; i++){
            if (i < 10){
                System.out.print("номер строки: " + i + "  |");
            } else {
                System.out.print("номер строки: " + i + " |");
            }
            z = 0;
            for (j = -12; j < figure; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println("| Количество колонок в строке: " + z);
        }

    }
}
