package Functions;

public class BinoCoeff {
    public static int factorialCalculator(int Num1){
        int f = 1;
        for(int i = 1; i <= Num1; i++){
            f = f * i ;
        }
        return f;
    }

    public static int Bino(int n , int r){
        int fact_n = factorialCalculator(n);
        int fact_r = factorialCalculator(r);
        int fact_nmr = factorialCalculator(n-r);
        return fact_n/(fact_r*fact_nmr);
    }

    public static void main(String[] args) {
        System.out.println(Bino(5,2));
    }
}
