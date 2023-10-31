import java.util.*;
public class Bak_2563 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[][] arr = new int[100][100];
        int result = 0;
        int x,y =0;

        for (int i = 0; i < input; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    arr[j][k] = 1;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 1){
                    result += arr[i][j];
                }
            }
        }

        System.out.println(result);
    }
}
