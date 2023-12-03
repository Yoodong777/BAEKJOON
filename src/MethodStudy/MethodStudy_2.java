package MethodStudy;

public class MethodStudy_2 {

    public static void numbering(int limit /* 매개변수 */){
        int i = 0;
        while(i < limit){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(2);
    }
}
