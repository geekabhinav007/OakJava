import java.util.*;
public class Swap {
    public static void swapWithoutTemp(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping");

        System.out.println(" x = " + x + " y = " + y);
    }
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X ");
        x = sc.nextInt();
        System.out.println("Enter the value of Y ");
        y = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println(" x = " + x + " y = " + y);
        swapWithoutTemp(x, y);
        
    }
}
