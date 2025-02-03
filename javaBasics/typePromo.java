package javaBasics;

public class typePromo {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int) (a));
        System.out.println(a);
        System.out.println(b-a);

        int n1 = 10;
        float n2 = 10.25f;
        long c = 25;
        double d = 30;
        double ans = n1 + n2 + c + d;
        System.out.println(ans);

        byte b1 = 5;
        b1 = (byte) (b1*2);
        System.out.println(b1);


    }
}
