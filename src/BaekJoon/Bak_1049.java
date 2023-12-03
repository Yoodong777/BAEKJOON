package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bak_1049 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int payMoney = 0;
        int[] pack = new int[M];
        int[] unit = new int[M];
        for(int i=0; i<M; i++) {
            pack[i] = scan.nextInt();
            unit[i] = scan.nextInt();
        }

        Arrays.sort(pack);
        Arrays.sort(unit);

        payMoney = Math.min(((N/6) + 1) * pack[0], Math.min(N * unit[0], ((N/6) * pack[0]) + ((N%6) * unit[0])));

        System.out.println(payMoney);
        scan.close();
    }

}