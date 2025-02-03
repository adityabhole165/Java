package javaBasics.PracticeSet;

import java.util.*;;
public class Sum3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int sum = a + b + c;
    float avg = sum / 3;
    System.out.println(avg);
    sc.close();
   }
}
