package BaekJoon;

import java.util.Scanner;
public class Bak_2501 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int result = 0;

        for (int i = 1; i < a + 1; i++) {
            if(a%i == 0){
                count++;
            }
            if(count == b){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}