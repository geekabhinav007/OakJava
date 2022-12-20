import java.util.*;
public class sumOfNaturalNumber{
    public static int sumOfNaturalNo(int n){
        int sum = 0;
        if(n == 0){
            return 0;
        }
        sum = n + sumOfNaturalNo(n-1);
        return sum;
    
    }
    public static void main(String[] args){

        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println(sumOfNaturalNo(number));

    }
}