import java.util.*;
public class Bak_14215 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] s = {A, B, C};
        Arrays.sort(s);

        //System.out.println(s[0]);
        //System.out.println(s[1]);
        //System.out.println(s[2]);

        if(s[0]+s[1] > s[2]){
            System.out.println(A+B+C);
        }else{
            System.out.println((s[0]+s[1]) * 2 - 1);
        }
    }
}
