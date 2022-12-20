import java.util.Scanner;

public class simpleInterest{
    public static void main(String args[]){
        System.out.println("Enter the value of P,R,T ");
        Scanner sc = new Scanner(System.in);

        float P = sc.nextFloat();
        float R = sc.nextFloat();
        float T = sc.nextFloat();

        float SI;
        SI = (P*R*T)/100;
        System.out.println(SI);

    }
}