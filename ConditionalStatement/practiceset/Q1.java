package practiceset;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number ");
        int number = sc.nextInt();
        if ( number >0 ){
            System.out.println("Number is positive");
        }else {
            System.out.println("number is negative");
        }
        sc.close();
    }
}
