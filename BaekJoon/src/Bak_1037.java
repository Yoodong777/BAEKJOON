import java.util.*;

public class Bak_1037 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        System.out.println((num[0]*(num[N-1])));

    }
}
