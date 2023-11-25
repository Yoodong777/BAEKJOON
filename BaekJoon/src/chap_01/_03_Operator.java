package chap_01;

public class _03_Operator {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        x = 3;
        y = 3;
        boolean b = (x == y) ? true : false;
        System.out.println(b);

        x = 3;
        y = 4;
        String s = ( x != y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
