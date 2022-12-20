import java.util.Scanner;

public class recursion{
    static int factorial(int n){
        if(n == 0)
        {
            return 1;
        }
        
         return n*factorial(n-1);
    
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        System.out.println("This a program of factorial of a number");
        System.out.println("Enter the number to compute factorial:");
        int n = scan.nextInt();
        System.out.println("We are going to find the factorial of " + n + ".");
        //iterrative approach
        int fact = 1;
        for(int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of "+ n + " is " + fact + ".");

        System.out.println("The factorial of "+ n + " using recursion is " + factorial(n) + ".");

    }
}