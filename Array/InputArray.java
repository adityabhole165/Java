package Array;

import java.util.Scanner;

public class InputArray {
    
    public static void main(String[] args) {
        int marks [] = new int[ 100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks out of 100");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("physics = "+ marks[0]);
        System.out.println("chemistry = "+ marks[1]);
        System.out.println("math = "+ marks[2]);
        
        // update value
        marks[2] = marks[2] + 1;
        System.out.println("math = "+ marks[2]);

        // percentage 
        int percentage = (marks[1] + marks [2] + marks [3])/3;
        System.out.println("percentage = "+percentage);
        sc.close();

        //Length of Array
        int marks1 [] = new int[43];
        int marks2 [] = new int[12];

        System.out.println("ength of array marks1 = " + marks1.length);
        System.out.println(
        "ength of array marks1 = " + marks2.length);

    }
}
