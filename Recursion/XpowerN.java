import java.util.*;
public class XpowerN {
    // Stack Height = logN
    public static int Xpowern(int x , int n){

        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0){
            return Xpowern(x,n/2) * Xpowern(x,n/2);
        }
        else{
            return Xpowern(x,n/2) * Xpowern(x,n/2) * x;
        }
    }
    public static void main(String [] args){
        int x,n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        n = sc.nextInt(); 
        System.out.println(Xpowern(x, n));

    }
}
