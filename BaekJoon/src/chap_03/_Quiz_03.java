package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String s1 = "960622-1321221";
        String s2 = "980326-2312321";

        System.out.println(s1.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(s2.substring(0, s2.indexOf("-")+2));
    }
}
