package lr9.Example10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
В кругу стоят N человек, пронумерованных от 1 до N. При
ведении счета по кругу вычеркивается каждый второй человек, пока не
останется один.
 */
public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(5);
        long start = System.currentTimeMillis();
        List<String> list = new ArrayList<>(N);
        for(int i = 1; i <= N; i++){
            list.add("Человек: " + i);
        }
        //System.out.println(list);
        int currentIndex = 1;
        while(list.size() > 1){
            list.remove(currentIndex);
            currentIndex = (currentIndex + 1) % list.size();
        }
        long end = System.currentTimeMillis();
        System.out.println("Остался последним: " + list);
        System.out.println("время: " + (end - start) + " ms");
    }
}
