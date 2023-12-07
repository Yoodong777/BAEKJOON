package MethodStudy;

import java.util.Arrays;
public class MethodStudy_9 {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 5! = 5 * 4 * 3 * 2 * 1 = 120
        v2();
    }

    public static void v2(){
        System.out.println("1");

    }

    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
}
