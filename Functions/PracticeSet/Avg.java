package Functions.PracticeSet;

import java.util.Scanner;

public class Avg {
    
    public static void main(String[] args) {
        // Write a Java method to compute the averageof three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = sc.nextInt();
        System.out.println("Enter second Number");
        int y = sc.nextInt();
        System.out.println("Enter Third Number");
        int z = sc.nextInt();
        System.out.println("Avrage of 3 numbers is " + average(x, y, z));

        sc.close();
    }
    public static float average(int n1, int n2, int n3){
        return(n1+n2+n3/3.0f);
    }
}
