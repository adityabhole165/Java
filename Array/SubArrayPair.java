package Array;

public class SubArrayPair {
    public static void SubArrayPairMethod(int number[]){
        int TotalSubarray = 0;
        for(int i = 0; i< number.length; i++){
            int start = i;
            for(int j = 0; j < number.length;j++ ){
                int end = j;
                for(int k = start; k<=end ; k++){
                    System.out.print(number[k] +" " );
                    TotalSubarray++;
                }
                System.out.println();
            }
            
        } 
        System.out.println("TotalSubarray = " + TotalSubarray);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        SubArrayPairMethod(number);
    }
}
