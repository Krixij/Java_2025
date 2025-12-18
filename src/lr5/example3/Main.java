package lr5.example3;


/*
Напишите программу с классом, у которого есть два целочисленных поля. В
классе должны быть описаны конструкторы, позволяющие создавать объекты
без передачи аргументов, с передачей одного аргумента и с передачей двух
аргументов.
 */
public class Main {
    public static void main(String[] args) {
        Task3 value1 = new Task3();
        Task3 value2 = new Task3(10);
        Task3 value3 = new Task3(78, 52);
        value1.showValue();
        value2.showValue();
        value3.showValue();
    }
}
