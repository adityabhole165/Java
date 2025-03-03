package Functions;

public class isPrime {
    public static boolean isPrimeNo(int n){
        // method 1:
        // boolean isPrime = true;
        // for(int i = 2 ; i <= n-1; i++){
        //     if (n % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }
        // return isPrime;

        //method 2:
        // if(n == 2){
        //     return true;
        // }
        // for(int i = 2 ; i <= n-1; i++){
        //     if (n % i == 0) {
        //         return false;
        //     }
        // }
        // return true;
        
        //Method 3 Optimised method
        if(n == 2){
            return true;
        }
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void IsPrimeInRange(int n){
        for(int i =2; i<=n ; i++){
            if(isPrimeNo(i)){
                System.out.println(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        IsPrimeInRange(10);
    }
}
