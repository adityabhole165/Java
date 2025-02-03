package javaBasics;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String Name = sc.next();
        // System.out.println(Name);
        // String fullName =sc.nextLine();
        // System.err.println(fullName);
        // String Statement = sc.nextLine();
        // System.out.println(Statement);
        int Number = sc.nextInt();
        System.out.println("\n"+ Number);

        float price = sc.nextFloat();
        System.out.println(price);
        sc.close();
    }
}
