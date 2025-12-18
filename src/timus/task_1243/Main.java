package timus.task_1243;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger N = new BigInteger(in.nextLine());
        BigInteger size = new BigInteger("7");
        BigInteger result = N.remainder(size);
        System.out.println(result);
    }
}
