package Functions;

public class FunOverlod {
    // public static int sum (int a, int b){
    //     return a + b;
    // }
  
    // public static int sum (int a, int b, int c){
    //     return a + b + c;
    // }

    public static int sum (int a, int b){
        return a + b;
    }
    public static  float sum(float a, float b){
        float ans = a + b;
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(sum(5,3));
        // System.out.println(sum(5,2,1));
        System.out.println(sum(5,3));
        System.out.println(sum(5f,3f));
    }
}
