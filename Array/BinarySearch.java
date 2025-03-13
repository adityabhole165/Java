package Array;

public class BinarySearch {
    public static int BinarySearcCode(int Numbers[], int key){
        int start = 0, end=Numbers.length-1 ;
        while(start <= end) {
            //formula to calculate mid in array.
            int mid = (start + end) / 2;

            //Comparison
            if (Numbers[mid] == key) { // found
                return mid;
            }
            if(Numbers[mid] < key ){ // for finding right side of array
                start = mid + 1;
            }else{
                end = mid - 1 ;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        //For Binary search Array is must be Sorted | Do not apply on the Unsorted Array
        // The Below Array is a Sorted Array.
        int Numbers[] = {2,4,6,8,10,12,16};
        int key = 4;

        //print result
        System.out.println("index for key is = "+BinarySearcCode(Numbers, key));
    }
}
