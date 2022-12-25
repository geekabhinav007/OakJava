
public class Reverse {
    public static void main(String[] args) {

        String originalString = "Abhinav is Good Boy.";
        StringBuilder originalstr = new StringBuilder("Abhinav is Good Boy.");

        // Method-1 using StrinBuilder Class
        originalstr.reverse();
        System.out.println(originalstr);

        // Method 2
        
        String result = "";
        for (int i = originalString.length()-1; i >=0 ; i--) {
            result += originalString.charAt(i); 
        }
        System.out.println(result);
    }
}
