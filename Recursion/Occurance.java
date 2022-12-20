public class Occurance {
    // Program to find First and last occurance of a charater in string.
    static int first = -1;
    static int last = -1;

    public static void occurance(int index, String str, char ch) {
        if (index == str.length()) {
            System.out.println("The first Occurance of " + ch + " is at " + first + " and last at " + last);
            return;
        }
        if (str.charAt(index) == ch) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        occurance(index + 1, str, ch);

    }

    public static void main(String [] args){
     String str = "bcdababa156awerfvtysa";
     char ch = 'a';
     occurance(0, str, ch);

    }
}
