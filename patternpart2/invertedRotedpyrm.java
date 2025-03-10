package patternpart2;

public class invertedRotedpyrm {
    public static void invertedRotedpyramid(int n){
        for(int i = 1; i <= n ; i ++){
            for(int j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRotedpyramid(4);
    }
}
