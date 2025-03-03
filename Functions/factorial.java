package Functions;

public class factorial {
    public static int factorialCalculator(int Num1){
        int f = 1;
        for(int i = 1; i <= Num1; i++){
            f = f * i ;
        }
        return f;
    }
    public static void main(String[] args) {
        int Ans =factorialCalculator(4);
        System.out.println(Ans);
    }
}
