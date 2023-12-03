package BaekJoon;

import java.util.Scanner;
public class Bak_1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = num;

        for (int i = 0; i < num; i++) {
            String st = sc.next();
            boolean[] test = new boolean[26];

            for (int j = 0; j < st.length() - 1; j++) {
                if(st.charAt(j) != st.charAt(j+1)){
                    if(test[st.charAt(j + 1) - 97]) {
                        cnt--;
                        break;
                    }
                }
                test[st.charAt(j) - 97] = true;
            }
        }
        System.out.println(cnt);
    }
}
