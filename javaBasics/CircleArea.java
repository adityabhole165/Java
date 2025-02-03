package javaBasics;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float Area = 3.14f * radius * radius ;
        System.out.println(Area);
        sc.close();
    }
}
