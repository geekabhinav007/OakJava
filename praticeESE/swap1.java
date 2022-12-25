public class swap1 {

    // swap using * / operator
    public static void main(String[] args) {
        int a = 1456;
        int b = 789;
        System.out.println("a is " + a + " b is " + b);
        // a = a * b; 
        // b = a / b; 
        // a = a / b; 
        // a = a + b; 
        // b = a - b; 
        // a = a - b; 
        
        a = a ^ b; 
        b = a ^ b; 
        a = a ^ b; 

        System.out.println("a is " + a + " b is " + b);

    }

}
