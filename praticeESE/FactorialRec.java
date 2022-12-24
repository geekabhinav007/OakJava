import java.util.*;

public class FactorialRec {
    public static int factorial(int n) {
        // base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N ");
        n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println(factorial);
    }

}
