package Loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("is a Prime ");
        }
        for(int i = 2 ; i <= Math.sqrt(n)/*n-1*/ ; i++){
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime == true) {
            System.out.println(  " is  prime");
        } else {
            System.out.println( " is not Prime ");
        } 
        
        sc.close();
    }
}
