package lr10.example8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class MyExcelParser {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String filePath = "D:\\Программирование\\lr10\\example4/example.xlsx";
        String sheetName = "Товары";
        while (true) {
            try {

                FileInputStream inputStream = new FileInputStream(filePath);

                XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

                XSSFSheet sheet = workbook.getSheet(sheetName);

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                workbook.close();
                inputStream.close();

                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден.\nПроверить путь к файлу");
                System.out.println("Хотите повторить? (y - если хочешь продолжить)");
                String answer = in.nextLine();
                if (!answer.equals("y")) {
                    System.out.println("Программа завершена");
                    break;
                }
                System.out.print("Введите новый путь к файлу: ");
                filePath = in.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный формат.\nПроверить файл, расширение файла должно быть .xlsx");
                System.out.println("Хотите повторить? (y - если хочешь продолжить)");
                String answer = in.nextLine();
                if (!answer.equals("y")) {
                    System.out.println("Программа завершена");
                    break;
                }
                System.out.print("Введите новый путь к файлу: ");
                filePath = in.nextLine();
            } catch (NullPointerException e) {
                System.out.println("Необходимый лист не найден.\nПроверить имя листа");
                System.out.println("Хотите повторить? (y - если хочешь продолжить)");
                String answer = in.nextLine();
                if (!answer.equals("y")) {
                    System.out.println("Программа завершена");
                    break;
                }
                System.out.print("Введите правильное имя листа: ");
                sheetName = in.nextLine();
            } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода");
                System.out.println("Хотите повторить? (y - если хочешь продолжить)");
                String answer = in.nextLine();
                if (!answer.equals("y")) {
                    System.out.println("Программа завершена");
                    break;
                }
            }
        }
        in.close();

    }
}