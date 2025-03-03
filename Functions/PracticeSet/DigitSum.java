package Functions.PracticeSet;
import java.util.*;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+ SumOfDigits(digits));
        sc.close();
    }
    public static int SumOfDigits(int number){
        int sumofDigits = 0;
        while (number>0) {
            int lastDigit = number % 10;
            sumofDigits += lastDigit;
            number /=10;
        }
        return sumofDigits;
    }
}
