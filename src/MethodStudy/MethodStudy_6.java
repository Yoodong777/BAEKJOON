package MethodStudy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodStudy_6 {
    public static String num(int i) {
        if(i == 0){
            return "zero";
        }else if(i == 1){
            return "one";
        }else if(i == 2){
            return "two";
        }
        return "none";
    }

    public static void main(String[] args) {

        System.out.println(num(3));
    }
}
