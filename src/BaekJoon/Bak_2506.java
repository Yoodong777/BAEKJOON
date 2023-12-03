package BaekJoon;

import java.util.Scanner;
public class Bak_2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int total = 0;
        int score = 0;

        for (int i = 0; i < a; i++) {
            int answer = sc.nextInt();
            if(answer == 1){
                score ++;
                total += score;
            }else if(answer == 0){
                score = 0;
            }
        }
        System.out.println(total);
    }
}
