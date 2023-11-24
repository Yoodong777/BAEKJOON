package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        
        int hour = 10;
        if(hour < 16) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1");

        //오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean moringCoffee = true; // 모닝 커피
        //if(hour < 14 && moringCoffee == false){
        if(hour < 14 && !moringCoffee){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        moringCoffee = false;
        //if(hour >= 14 || moringCoffee == true){
        if(hour >= 14 || moringCoffee){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
