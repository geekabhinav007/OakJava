import java.util.*;

public class Prime {
    public static boolean flag = true;

    public static void primeNo(int n) {
        System.out.println("List of prime number from 0 to "+ n);
        for (int j = 2; j < n; j++) {
            flag = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(j);

            }

        }
    }

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number at which you want to print Prime Number.");
        n = sc.nextInt();
        primeNo(n);

    }

}
