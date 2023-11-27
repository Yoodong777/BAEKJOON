import java.util.*;
public class Bak_2745 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int a = sc.nextInt();
        String[] arr = new String[st.length()];
        int b = 0;
        long sum = 0;

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i); /* 숫자든 문자든 한 단어로 받아 */
            if(c - 57 > 0){ /* 문자열 */
                arr[i] = String.valueOf(c - 55);
            }else{ /* 55를 안뺀다 */
                arr[i] = String.valueOf(c);
            }
            b = Integer.parseInt(arr[i]); /* 문자인 상태 에서 숫자로 변환해 */
            long result = (long)Math.pow(a, st.length() - i - 1); /* long으로 변환한다 */
            sum += b * result;
        }
        System.out.println(sum);
    }
}