package Loops;

public class RevN {
    public static void main(String[] args) {
        int n = 54321;
        int rev = 0;
        while (n>0) {
            int lastDigit = n % 10;
            n= n/10; 
            rev = ( rev * 10) + lastDigit;
        }
        System.out.println(rev);
    }
}
