package chap_06;

import java.util.StringTokenizer;

public class Practice_02 {
   public static void main(String[] args) throws Exception {
       String text = "홍길동/이수홍/박연수";

       StringTokenizer st = new StringTokenizer(text, "/");

       int countTokens = st.countTokens();
       for (int i = 0; i < countTokens; i++) {
            String token = st.nextToken();
           System.out.println(token);
       }

       st = new StringTokenizer(text, "/");
       while(st.hasMoreTokens()){
           String token = st.nextToken();
           System.out.println(token);
       }



    }
}
