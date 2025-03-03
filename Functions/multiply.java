package Functions;

import java.util.Scanner;

public class multiply {
    public static int multiplyNumbers(int Num1, int Num2) {
        int multiply = Num1 * Num2 ;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Ans = multiplyNumbers(Num1, Num2);
        System.out.println("Multiplication Ans =  "+ Ans);
        sc.close();

    }
}
