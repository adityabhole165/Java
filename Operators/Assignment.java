package Operators;

public class Assignment {
    public static void main(String[] args) {
        // 1
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.println(exp1 );
        System.out.print(exp2);
        System.out.println("__________________________________________________");
        
        // 2
        int a = 200, b = 50, z = 100;
        if(a > b && b > z){
            System.out.println("Hello");
        }
        if(z > b && z < a){
            System.out.println("Java");
        }
        if((b+200) < a && (b+150) < z){
            System.out.println("Hello Java");
        }

        System.out.println("__________________________________________________");
        // 3
        int l, m, n;
        l = m = n = 2;
        l += m;
        m -= n;
        n /= (l + y);
        System.out.println(l + " " + m + " " + n);
        // 4
        System.out.println("__________________________________________________");

        int x1 = 9, y1 = 12;
        int a1 = 2, b1 = 4, c1 = 6;
        int exp = 4/3 * (x1 + 34) + 9 * (a1 + b1 * c1) + (3 + y1 * (2 + a1)) / (a1 + b1*y1);
        System.out.println(exp);

        System.out.println("__________________________________________________");

        int x2 = 10, y2 = 5;
        int exp11 = (y2 * (x2 / y2 + x2 / y2));
        int exp22 = (y2 * x2 / y2 + y2 * x2 / y2);
        System.out.println(exp11);
        System.out.println(exp22);

    }
}


// OPERATORS QUESTIONS
// Question :What will be the output of the followingprograms :
// (i)public class Test {public static void main(String[] args){int l = 2, y = 5;int exp1 = (x * y / x);int exp2 = (x * (y / x));System.out.print(exp1 + “ , ”);System.out.print(exp2);}}
// (ii)public class Test {public static void main(String[] args) {int x = 200, y = 50, z = 100;if(x > y && y > z){System.out.println("Hello");}if(z > y && z < x){System.out.println("Java");}if((y+200) < x && (y+150) < z){System.out.println("Hello Java");}}}
// (iii)public class Test {public static void main(String[] args){int x, y, z;x = y = z = 2;x += y;y -= z;z /= (x + y);System.out.println(x + " " + y + " " + z);}}
// (iv)public class Test {public static void main(String[] args){int x = 9, y = 12;int a = 2, b = 4, c = 6;int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);System.out.println(exp);}}
// (v)public class Test {public static void main(String[] args){int x = 10, y = 5;int exp1 = (y * (x / y + x / y));int exp2 = (y * x / y + y * x / y);System.out.println(exp1);System.out.println(exp2);}}
