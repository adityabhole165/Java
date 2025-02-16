package Loops;

import java.util.Scanner;

public class Multi10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        do {
            System.out.print("enter the Number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
        System.out.println("End");
        sc.close();
    }
}
