package lr8;

import java.io.*;

/*
Чтение из одного файла и запись в другой файл дан-
ных посимвольно.
 */
public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("D:\\MyFile1.txt");
            out = new FileWriter("D:\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1){
                out.append((char)oneByte);
                System.out.println((char) oneByte);
            }
        } catch (IOException e){
            System.out.println("Ошибка");
        } finally {
            in.close();
            out.close();
        }
    }
}
