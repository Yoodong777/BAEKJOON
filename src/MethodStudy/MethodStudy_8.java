package MethodStudy;

import java.util.Arrays;

public class MethodStudy_8 {
    public static String[] getMembers() {
        String[] members = {"최진혁", "최유빈", "한이람"};
        String[] members2 = {"유동현", "윤승휘", "김용석"};
        String[] members3 = {"김승진", "김연우", "한성진"};

        if(members == members2){
            return members2;
        }else if(members == members3){
            return members;
        }else{
            return members3;
        }
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(getMembers()));
    }
}
