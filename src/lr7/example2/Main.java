package lr7.example2;

/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе (суперклассе) должен быть метод для присваивания значения полю с
текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки. На
основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое
(публичное) целочисленное поле. В классе должны быть такие версии метода для
присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
 */

public class Main {
    public static void main(String[] args) {
        SuperClassTask2 superClassTask2 = new SuperClassTask2("Поле для SuperClass");
        System.out.println(superClassTask2.toString());

        SubClassTask2 subClassTask2 = new SubClassTask2("Поле для SubClass");
        System.out.println(subClassTask2.toString());

        subClassTask2.setValue("Второе поле для SubClass", 54);
        System.out.println(subClassTask2.toString());

        subClassTask2.setValue(985);
        System.out.println(subClassTask2.toString());

        subClassTask2.setConstValue();
        System.out.println(subClassTask2.toString());
    }
}
