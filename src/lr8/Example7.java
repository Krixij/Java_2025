package lr8;

import java.io.*;

/*
Чтение из одного файла и запись в другой файл дан-
ных построчно с использованием буфера в 1 килобайт.
 */
public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("D:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("D:\\MyFile2.txt"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e){
            System.out.println("Ошибка");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
