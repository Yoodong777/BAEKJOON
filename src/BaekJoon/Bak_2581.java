package BaekJoon;

import java.util.Scanner;
public class Bak_2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] array = new int[N];
        int sum = 0;
        int index = 0;

        for (int i = M; i <= N; i++) {
            for (int j = 2; j <= i; j++) {
                if(j == i){
                    sum+= i;
                    array[index] = i;
                    index++;
                }if(i % j == 0){
                    break;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }if(sum > 0){
            System.out.println(sum);
            System.out.println(array[0]);
        }
    }
}
