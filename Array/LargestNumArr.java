package Array;

public class LargestNumArr {
    public static int gitLargest (int Numbers[]){
        //minimum value set for larget number
        int largest = Integer.MIN_VALUE;
        //minimum value set for Smallest number
        int Smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i < Numbers.length ; i ++){
            //if condition for the largest logic
            if (largest < Numbers[i]) {
                largest = Numbers[i];
            }
            //if condition for the Smallest  logic
            if (Smallest > Numbers[i]) {
                Smallest = Numbers[i];
            }
        }
        System.out.println("Smallest number is = " +  Smallest );
        return largest;
    }
    public static void main(String[] args) {
        int Numbers [] = {1,2,6,3,5};

        System.out.println("Largest number is = " + gitLargest(Numbers));


    }
}
