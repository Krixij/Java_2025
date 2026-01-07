package lr8;

import java.io.*;

/*
Создать проект, позволяющий из одного текстового файла, содержащего несколько строк (тип String)
заранее подготовленного текста на русском языке (Пушкин, Лермонтов или другой российский классик на Ваш вкус),
построчно переписать в другой текстовый файл слова начинающиеся с согласных букв.
Требования:
–	слова из предложения выделять методом split();
–	в новом файле следует указать номер строки, в которой искомые слова находились в исходном файле;
–	для каждой строки указать количество выбранных слов.
 */
public class Example12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String letters = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(
                            "D:\\Task12\\File1.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(
                            "D:\\Task12\\File2.txt"), "cp1251"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                int sum = 0;
                StringBuilder str = new StringBuilder();
                String[] words = s.split("[\\s\\p{Punct}]+");
                lineCount++;
                for (String word : words){
                    if (!word.isEmpty()) {
                        char firstLetter = word.charAt(0);
                        if (letters.indexOf(firstLetter) != -1) {
                            str.append(word).append(" ");
                            sum++;
                        }
                    }
                }
                bw.write(lineCount + ": " + str + " ||| Количество слов в строке: " + sum);
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Ошибка" + e);
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
