package Array;

public class CreatingArray {
    public static void main(String[] args) {
        //syntax = data type array name [] = new data type [size];
        int marks [] = new int [50];
        int numbers [] = {11,2,3,4};
        int MoreNumbers [] = { 4,5,6,7};
        String Fruits [] = {"Apple","Mango"};  
        System.out.println("Numbers array:");
        printArray(numbers);
        System.out.println("marks:");
        printArray(marks);
        
        System.out.println("MoreNumbers array:");
        printArray(MoreNumbers);
        
        System.out.println("Fruits array:");
        printArray(Fruits);
    }

    // Method to print integer arrays
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to print String arrays
    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    
    }
}
