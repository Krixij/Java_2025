package lr6.example8;

/*
Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве).
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 7, 9, 15, 20};
        double average = Task8.getAverageNum(numbers);
        System.out.println(average);
        int[] matrix = {10, 78, 56, 45};
        average = Task8.getAverageNum(matrix);
        System.out.println(average);
    }
}
