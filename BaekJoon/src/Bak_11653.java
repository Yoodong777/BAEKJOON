import java.util.*;
public class Bak_11653 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] array = new int[N];
        int index = 0;

        for (int i = 0; i <= N; i++) {
            for (int j = 2; j <= N; j++) {
                if (N % j == 0) {
                    array[index] = j;
                    System.out.println(array[index]);
                    index++;
                    if (N == j * j) {
                        array[index] = j;
                        System.out.println(array[index]);
                        return;
                    }
                    N = N / j;
                    break;
                }
            }
        }
    }
}