package patternpart2;

public class solidRhombus {
    public static void SolidRhombus(int n){
        for(int i = 1; i<=n ; i ++){
            for(int j= 1 ; j<= (n-i); j++){
                System.err.print(" ");
            }
            for(int j=1; j<= n; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        SolidRhombus(5);
    }
}
