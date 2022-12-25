
public class lowTOupANDupTOlow {

    static String lowerToUpper(String s) {
        char ch = ' ';
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ch = (char) (s.charAt(i) - 32);
            } else {
                // For character other than small a to z
                ch = s.charAt(i);
            }
            result += ch;
        }
        return result;

    }
    static String upperToLower(String s) {
        char ch = ' ';
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                ch = (char) (s.charAt(i) + 32);
            } else {
                // For character other than small A to Z
                ch = s.charAt(i);
            }
            result += ch;
        }
        return result;

    }

    public static void main(String[] args) {

        String lowerString = "abhinav is good boy";
        String upperString = "I AM ABHINAV";

        // Method-1
        System.out.println(lowerString.toUpperCase());
        System.out.println(upperString.toLowerCase());

        // Method-2
        String str = lowerToUpper(lowerString);
        System.out.println(str);
        String str1 = upperToLower(upperString);
        System.out.println(str1);


    }
}
