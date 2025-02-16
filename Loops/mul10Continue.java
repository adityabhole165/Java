package Loops;

import java.util.Scanner;

public class mul10Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter the number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number is " + n);
            sc.close();
        } while (true);
    }
}
