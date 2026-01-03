package lr7.example4;

/*
Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
 */
public class Main {
    public static void main(String[] args) {
        SuperClassTask4 superClassTask4 = new SuperClassTask4('e');
        System.out.println(superClassTask4.toString());
        SubClassTask4 subClassTask4 = new SubClassTask4('r', "Light");
        System.out.println(subClassTask4.toString());
        SubClass2Task4 subClass2Task4 = new SubClass2Task4('y', "House", 654);
        System.out.println(subClass2Task4.toString());
    }
}
