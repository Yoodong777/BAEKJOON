import java.util.*;

public class Bak_2720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        for (int i = 0; i < a; i++) {
            int t = sc.nextInt();

            if(t >= 1 && t <= 500){
                System.out.print(t / Quarter + " ");
                int c = t % Quarter;
                System.out.print(c / Dime + " ");
                c = c % Dime;
                System.out.print(c / Nickel + " ");
                c = c % Nickel;
                System.out.print(c / Penny + " ");
                System.out.println();

            }

        }

    }

}