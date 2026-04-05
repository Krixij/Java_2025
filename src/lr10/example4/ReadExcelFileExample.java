package lr10.example4;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        //Открывем файл Excel для чтения
        String filePath = "D:\\Программирование\\lr10\\example4/example.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        //Создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        //Перебираем строки и ячейки листа
        for (Row row : sheet) {
            for (Cell cell : row){
                //Выводим значение ячейки на экране
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        //Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
