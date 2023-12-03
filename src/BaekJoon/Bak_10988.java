package BaekJoon;

import java.util.Scanner;
public class Bak_10988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();

        for (int i = 0; i < st.length() / 2; i++) {
            char front = st.charAt(i);
            char back = st.charAt((st.length()-1)-i);

            if(front != back){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}


