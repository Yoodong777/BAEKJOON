package MethodStudy;

public class MethodStudy {
    public static void numbering(){
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }
    }

    public static void numbering2(){
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            numbering();
        }
    }
}
