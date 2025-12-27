package lr6.example3;

/*
Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел.
 */
public class Main {
    public static void main(String[] args) {
        int max = Task3.getMax(1, 2, 3, 4, 5);
        System.out.println("Max: " + max);
        int min = Task3.getMin(1, 2, 3, 4, 5);
        System.out.println("Min: " + min);
        int[] num ={1, 2, 3, 0, 4, 5};
        double averageNum = Task3.getAverageNum(num);
        System.out.println("Average number: " + averageNum);
    }
}
