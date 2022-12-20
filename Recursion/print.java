public class print {
    // This Program will print the number from 5 to 1 using Recursion.
    public static void print_5_1(long n){
        if(n == 0){
            return;
        }
        
        System.out.print(n + " ");
        print_5_1(n-1);
    }
    public static void main(String[] args){
        long number = 5;
        print_5_1(number);
        System.out.println("\n");
    }
}
