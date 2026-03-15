package lr9.Example10;

import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = random.nextInt(100000);
        long start = System.currentTimeMillis();
        LinkedList<String> list = new LinkedList<>();
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
