package Functions.PracticeSet;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int Palindrom = sc.nextInt();
        if(isPalindrome(Palindrom)){
            System.out.println("Number : " + Palindrom + " is a Palindrom");
        }else{
            System.out.println("Number : " + Palindrom + " is NOT a Palindrom");
        }
        sc.close();

    }

    public static boolean isPalindrome( int Number){
        int PalindromNum = Number;
        int reverse = 0;

        while (PalindromNum != 0) {
            int remainder = PalindromNum % 10;
            reverse = reverse * 10 + remainder;
            PalindromNum = PalindromNum / 10;
        }
        if(Number == reverse) {
            return true;
        }

        return false;
    }
}
