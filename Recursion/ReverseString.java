public class ReverseString {

    public static void reverseString(int index, String str) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(index - 1, str);
        
    }

    public static void main(String[] args) {
        String str = "Kumar Abhinav";
        reverseString(str.length()-1, str);
        System.out.println("");

    }
}
