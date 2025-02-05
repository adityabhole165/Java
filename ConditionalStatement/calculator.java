import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter A");
        int a  = sc.nextInt();
        System.out.println("enter B");
        int b = sc.nextInt();
        
        System.out.println("enter operator");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Ans =" + (a+b));
                
                break;
            case '-':
                System.out.println("Ans =" +(a-b));
                
                break;
            case '*':
                System.out.println("Ans =" +(a*b));
                
                break;
            case '/':
                System.out.println("Ans =" +(a/b));
                
                break;
        
            default:
                    System.out.println("Invalid Operator");
                break;

            }
            sc.close();
    }
}
