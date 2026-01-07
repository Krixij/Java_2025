package lr8;

import java.io.*;
import java.util.Scanner;

/*
Создать файл на диске, ввести заданное с клавиатуры
количество строк текста и записать их в файл в формате UTF-8.
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла => ");
        String fname = sc.nextLine();
        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.println("Введите количество строк для записи в файл => ");
            int n = sc.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i <n; i++){
                System.out.println("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s + "\n");
            }
            dOut.flush();
            dOut.close();

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true){
                System.out.println(dIn.readUTF());
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
