package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // and 를 , 로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작 (이전 내용 삭제)
        System.out.println(s.substring(s.indexOf("java")));
        System.out.println(s.substring(s.indexOf("java"), s.indexOf("."))); // 시작 위치부터 끝 위치 " 직전"

        // 공백 제거
        s = "      i love java.";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); //Java,Python
        System.out.println(s1.concat(",").concat(s2)); //Java,Python


    }
}
