package patternpart2;

public class HolloReactange {
    public static void HollowReactangle(int totrows,int totcolms){
        for(int i = 1; i <= totrows ; i++) {
            for(int j =1; j <= totcolms; j ++){
                if(i == 1 || i == totrows || j == 1|| j == totcolms ){
                    System.err.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowReactangle(4,5);
    }
}
