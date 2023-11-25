import java.util.*;
public class Bak_2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int result = sc.nextInt();

        double day = Math.ceil((double)(result - down) / (up - down));
        System.out.println((int)day);

    }
}