package Loops;

public class RevNum{
    public static void main(String[] args) {
        int  n = 180703;
        while (n > 0) {
            int LastDig = n % 10;
            System.out.print(LastDig + " ");
            n = n / 10; 
        }
        System.out.println();
    }
}