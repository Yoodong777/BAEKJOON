import java.sql.SQLOutput;
import java.util.*;
public class Bak_2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String c = sc.next();
            for (int j = 0; j < M; j++) {
                arr[i][j] = c.charAt(j) - '0';

            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 1){
                    count++;
                }else if(arr[i][j] == 0){
                    break;
                }
            }
        }

        System.out.println(count);

    }
}
