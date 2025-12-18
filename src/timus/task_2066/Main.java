package timus.task_2066;

import com.sun.jdi.request.BreakpointRequest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result;
        if (b <= 1){
            result = b + c;
            result = a - result;
        } else {
            result = a - b * c;
        }
        System.out.println(result);
    }
}
