package Functions.PracticeSet;

import java.util.*;
public class even {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer");
    int Number = sc.nextInt();
    if(isEven(Number)){
        System.out.println("Number is Even");
    }else {
        System.out.println("number is Odd");
    }
    sc.close();
  }
  public static boolean isEven(int number){
    if(number % 2 == 0){
        return true;
    }else{
        return false;
    }
  }
}
