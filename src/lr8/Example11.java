package lr8;

import java.io.*;
import java.util.Scanner;

/*
Создать проект, позволяющий из одного, предварительно созданного программными средствами файла,
переписать данные, соответствующие условию - в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double.
В результирующий файл переписать вторую строку и положительные числа.
 */
public class Example11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File f1 = new File("D:\\Task11");
            f1.mkdir();
            File f2 = new File("D:\\Task11\\File1.txt");
            f2.createNewFile();
            if (f2.exists()){
                System.out.println("Создан первый файл");
            }
            DataOutputStream dOut = new DataOutputStream((new FileOutputStream(f2)));
            for (int i = 0; i < 2; i++){
                System.out.println("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }

            System.out.println("Введите числа: ");
            for (int i = 0; i < 5; i++){
                dOut.writeDouble(sc.nextDouble());
            }
            dOut.flush();
            dOut.close();

            File f3 = new File("D:\\Task11\\File2.txt");
            f3.createNewFile();
            if (f3.exists()){
                System.out.println("Создан второй файл");
            }
            DataInputStream dIn = new DataInputStream(new FileInputStream(f2.getAbsolutePath()));
            dOut = new DataOutputStream(new FileOutputStream(f3.getAbsolutePath()));
            try {
                for (int i = 0; i < 2; i++) {
                    String s = dIn.readUTF();
                    if (i == 1) {
                        dOut.writeUTF(s);
                        System.out.println("Строка: " + s);
                    }
                }
                for (int i = 0; i < 5; i++){
                    double number = dIn.readDouble();
                    if (number > 0) {
                        dOut.writeDouble(number);
                        System.out.println("Число: " + (double) number);
                    }
                }
            } catch (EOFException e) {}
            dOut.flush();
            dOut.close();
            dIn.close();
        } catch (IOException e){
            System.out.println("End of file");
        }
    }
}
