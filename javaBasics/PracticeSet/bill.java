package javaBasics.PracticeSet;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float Eraser = sc.nextFloat();
        float Bill = Pencil + pen + Eraser;
        System.out.println(Bill);

        //tax
        float newbill = Bill + (Bill * 0.18f) ;
        System.out.println("Bill = "+newbill);
        sc.close();
    }
}
