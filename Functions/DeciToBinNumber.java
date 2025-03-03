package Functions;

public class DeciToBinNumber {
    public static void DeciToBinNumber(int Num) {
        int myNum = Num ;
        int pow = 0;
        int binNum = 0;

        while(Num > 0){
            int rem = Num % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow ++;
            Num = Num / 2;
        }
        System.out.println("binary of  " + myNum + " is " + binNum);    
    }
    public static void main(String[] args) {
        DeciToBinNumber(7);
    }
}
