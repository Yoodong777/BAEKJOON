package chap_04;

public class _05_For {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++ ) {
            //System.out.println("환영합니다. 나코입니다 ");
            System.out.println("환영합니다. 유동입니다 ");
            System.out.println("환영합니다. 나코입니다 ");

        } //(fori 적으면 알아서 적어줌)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1;  i < 10; i +=2) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);

        }
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


}
