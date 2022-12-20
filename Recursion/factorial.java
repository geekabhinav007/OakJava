import java.util.*;
public class factorial {
    public static int factorialofn(int n){
        int fact = 1;
        if(n == 1 || n == 0){
            
            return 1;
        }
    
        fact = n * factorialofn(n-1);
        return fact;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factorila of "+ number + " is " + factorialofn(number));
        
    }

}
