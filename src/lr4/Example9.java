package lr4;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите программу «Шифр Цезаря», в которой необходимо реализовать
собственный алфавит, остальные условия идентичны задаче 8.
 */
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();
        in.nextLine();
        String alphabetRusLowercase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String alphabetRusUppercase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String alphabetEnLowercase = "abcdefghijklmnopqrstuvwxyz";
        String alphabetEnUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] arrayAlphabetRusLowercase = alphabetRusLowercase.toCharArray();
        char[] arrayAlphabetRusUppercase = alphabetRusUppercase.toCharArray();
        char[] arrayAlphabetEnLowercase = alphabetEnLowercase.toCharArray();
        char[] arrayAlphabetEnUppercase = alphabetEnUppercase.toCharArray();
        char[] arrayCharNew = new char[text.length()];
        int indexElement;
        for (int i = 0; i < text.length(); i++){
            char element = text.charAt(i);
            int index = alphabetRusLowercase.indexOf(element);
            if (index != -1){
                indexElement = (index + key) % alphabetRusLowercase.length();
                if (indexElement < 0){
                    indexElement += alphabetRusLowercase.length();
                }
                arrayCharNew[i] = arrayAlphabetRusLowercase[indexElement];
            } else if ((index = alphabetEnLowercase.indexOf(element)) != -1){
                indexElement = (index + key) % alphabetEnLowercase.length();
                if (indexElement < 0){
                    indexElement += alphabetEnLowercase.length();
                }
                arrayCharNew[i] = arrayAlphabetEnLowercase[indexElement];
            } else if ((index = alphabetEnUppercase.indexOf(element)) != -1){
                indexElement = (index + key) % alphabetEnUppercase.length();
                if (indexElement < 0){
                    indexElement += alphabetEnUppercase.length();
                }
                arrayCharNew[i] = arrayAlphabetEnUppercase[indexElement];
            } else if ((index = alphabetRusUppercase.indexOf(element)) != -1){
                indexElement = (index + key) % alphabetRusUppercase.length();
                if (indexElement < 0){
                    indexElement += alphabetRusUppercase.length();
                }
                arrayCharNew[i] = arrayAlphabetRusUppercase[indexElement];
            } else {
                arrayCharNew[i] = element;
            }
        }
        System.out.println("Текст после преобразования: " + String.valueOf(arrayCharNew));
        while (true){
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String letter = in.nextLine();
            if (letter.equals("y")){
                char[] decryptArrayChar = new char[arrayCharNew.length];
                for (int i = 0; i < arrayCharNew.length; i++){
                    char element = arrayCharNew[i];
                    int index = alphabetRusLowercase.indexOf(element);
                    if (index != -1){
                        indexElement = (index - key) % alphabetRusLowercase.length();
                        if (indexElement < 0){
                            indexElement += alphabetRusLowercase.length();
                        }
                        decryptArrayChar[i] = arrayAlphabetRusLowercase[indexElement];
                    } else if ((index = alphabetEnLowercase.indexOf(element)) != -1){
                        indexElement = (index - key) % alphabetEnLowercase.length();
                        if (indexElement < 0){
                            indexElement += alphabetEnLowercase.length();
                        }
                        decryptArrayChar[i] = arrayAlphabetEnLowercase[indexElement];
                    } else if ((index = alphabetEnUppercase.indexOf(element)) != -1){
                        indexElement = (index - key) % alphabetEnUppercase.length();
                        if (indexElement < 0){
                            indexElement += alphabetEnUppercase.length();
                        }
                        decryptArrayChar[i] = arrayAlphabetEnUppercase[indexElement];
                    } else if ((index = alphabetRusUppercase.indexOf(element)) != -1){
                        indexElement = (index - key) % alphabetRusUppercase.length();
                        if (indexElement < 0){
                            indexElement += alphabetRusUppercase.length();
                        }
                        decryptArrayChar[i] = arrayAlphabetRusUppercase[indexElement];
                    } else {
                        decryptArrayChar[i] = element;
                    }
                }
                System.out.println("Обратное перобразование: " + String.valueOf(decryptArrayChar));
                break;
            } else if (letter.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else{
                System.out.println("Введите корректный ответ");
            }

        }
    }
}
