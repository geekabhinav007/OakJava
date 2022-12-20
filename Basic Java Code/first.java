// Import scanner class to take input from user
import java.util.Scanner;


public class first{
    public static void main(String args[]){
        System.out.println("Hello World");
        // By default java interprete Long as a integer

        // long L = 25012312532;
        // System.out.println(L);

        /*
         first.java:5: error: integer number too large
        long L = 25012312532;
                 ^
        1 error
         */
        long L = 25012312532L;
        System.out.println(L); // output 25012312532
        //Java dont allow , to increse readabality of number like 3,00,000,000
        // But it allow 3_00_000_000

        long L2 = 3_00_000_000L;
        System.out.println(L2); // output 25012312532

        // Just like long we have to tell java in case of Float
        // because by default it takes as a Double.
        
        // float f = 3.14;
        // System.out.println(f);

        /*
        first.java:26: error: incompatible types: possible lossy conversion from double to float
        float f = 3.14;
                  ^
        1 error
         */
        float f = 3.14F;
        System.out.println(f);
        double d = 4.18;
        System.out.println(d);


        // DECLEARING CONSTANT VARIABLE IN JAVA USING FINAL KEYWORD

        final int num = 45;

        // rEAD INPUT IN JAVA

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        System.out.println(n);

    }
}