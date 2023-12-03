package chap_06;

public class Study_20231129 {
        public static void main(String[] args) {
        }
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
