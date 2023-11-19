import java.util.*;
public class Bak_1157 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String st = sc.next();

        for (int i = 0; i < st.length(); i++) {

            if('A' <= st.charAt(i) && st.charAt(i) <= 'Z'){
                arr[st.charAt(i) - 'A']++;
            }

            else {
                arr[st.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if(arr[i] > max){
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
