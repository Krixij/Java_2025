package lr9;

import java.util.HashMap;
import java.util.Map;

/*
Заполнить HashMap 10 объектами <Integer, String>. Найти строки
у которых ключ > 5 Если ключ = 0, вывести строки через запятую.
Перемножить все ключи, где длина строки > 5.
 */
public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] words = {"ноль", "один", "два", "три", "четыре",
                "пять", "шесть", "семь", "восемь", "девять"};
        for (int i = 0; i < 10; i++){
            map.put(i, words[i]);
        }
        for (Integer key : map.keySet()) {
            if (key > 5){
                String value = map.get(key);
                System.out.print(key + ": " + value + " ");
            }
        }
        System.out.println();
        if (map.containsKey(0)) {
            String allValues = String.join(", ", map.values());
            System.out.println(allValues);
        }

        Integer result = 1;
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            if (entry.getValue().length() > 5){
                result *= entry.getKey();
            }
        }
        System.out.println(result);
    }
}
