
import java.util.*;
public class Xtothepower {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int powerx = x * power(x, n-1);
        return powerx;
    }
    public static void main(String[] args) {
        int x,n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt(); 
        System.out.println(power(x, n));
    }
}
