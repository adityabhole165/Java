package Functions;
public class bintoDec {
    public static void Bino(int Num){
        int myNum = Num ;
        int pow = 0 ;
        int decNum = 0 ;

        while(Num > 0){
            int lastDigit = Num % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++ ;
            Num = Num / 10;
        }
        System.out.println("decimal of  " + myNum + " is " + decNum);
    }
    public static void main(String[] args) {
        Bino(111);
    }
}
