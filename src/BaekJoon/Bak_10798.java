package BaekJoon;

import java.util.Scanner;
public class Bak_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if( (arr[j][i] >= 'a' && arr[j][i] <= 'z')  || (arr[j][i] >= 'A' && arr[j][i] <= 'Z')  || (arr[j][i] >= '0' && arr[j][i] <= '9')  ) {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
