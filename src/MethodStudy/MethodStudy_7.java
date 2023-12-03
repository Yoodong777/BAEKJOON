package MethodStudy;

import java.util.Arrays;

public class MethodStudy_7 {
    public static String[] getMembers() {
       String[] members = {"최진혁", "최유빈", "한이람"};
       return members;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            System.out.println(Arrays.toString(getMembers()));
        }
    }
}
