package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bak_5073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numSort = new int[3];

        while (true) {
            numSort[0] = sc.nextInt();
            numSort[1] = sc.nextInt();
            numSort[2] = sc.nextInt();

            if (numSort[0] == 0 && numSort[1] == 0 && numSort[2] == 0) {
                break;
            }

            Arrays.sort(numSort);


            if (numSort[2] >= numSort[0] + numSort[1]) {
                System.out.println("Invalid");
            } else if (numSort[0] == numSort[1] && numSort[1] == numSort[2]) {
                System.out.println("Equilateral");
            } else if (numSort[0] == numSort[1] || numSort[1] == numSort[2] || numSort[0] == numSort[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
