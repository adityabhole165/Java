package Loops.QUESTIONS;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int ESum = 0;
        int OSum = 0;
        int number;
        do {
            System.out.println("Enter Number");
            number = sc.nextInt();
          
            if( number % 2 ==0){
                ESum =  number + ESum; 
            }else{
                OSum = number + OSum;
            }
            System.out.println("Do you want to Continue ? press 1 For Yes or 0 for NO");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("Sum of Even " + ESum);
        System.out.println("Sum of ODD " + OSum);
        sc.close();
    }
}
