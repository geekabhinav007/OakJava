import java.util.Scanner;

public class fibb{
    static int n1 =0;
    static int n2 =1;
    static int n3 = 0;
    static void fibb(int n){
        if (n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+ n3);
            fibb(n-1);
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(n1 + " " + n2);
        fibb(n-2);
        System.out.println();
    }
}