package chap_03;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("java")); // 포함된다면 true
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("java")); // 위치 정보 0,1,2,3,4,5,6,7
        System.out.println(s.indexOf("c#")); // 포함되지 않는다면 -1 반환
        System.out.println(s.indexOf("and")); // 처음 만나는(일치하는) 위치 정보 (12)
        System.out.println(s.lastIndexOf("and")); // 마지막으로 만나는(일치하는) 위치 정보 (23)
        System.out.println(s.startsWith("I like")); // 문자열 시작되는 문자가 맞으면 true
        System.out.println(s.endsWith(".")); // 문자열 끝나는 문자가 맞으면 true





    }
}
