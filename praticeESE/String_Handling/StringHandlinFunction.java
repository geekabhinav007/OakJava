import java.lang.*;

public class StringHandlinFunction {
    public static void main(String[] args) {
        String str = "I am abhinav";
        String str1 = new String("I am abhinav and I do programming.");
        StringBuilder str3 = new StringBuilder("I am Kumar Abhinav");
        // charAt function
        /*
         * It returns char value
         * for the particular index
         */
        // str.length() ==> It returns string length

        for (int i = 0; i < str3.length(); i++) {
            System.out.print(str3.charAt(i));
        }
        System.out.println("");
        // Sub string (subString)
        System.out.println(str.substring(5, 10));
        System.out.println(str1.substring(5, 10));
        System.out.println(str3.substring(5, 10));

        /*
         * boolean contains(CharSequence s) =>
         * It returns true or false after matching
         * the sequence of char value.
         */

        System.out.println(str.contains("abhi"));
        System.out.println(str1.contains("abhi"));
        // System.out.println(str3.contains("abhi")); // Not defined for StringBuilder

        /*
         * static String join(CharSequence delimiter, CharSequence... elements)
         * It returns a joined string.
         */

        System.out.println(String.join(" ", str, str3));
        System.out.println(String.join(" ", str1, str3));
        System.out.println(String.join(" ", str, str1));

        /*
         * boolean equals(Object another)
         * It checks the equality of string with the given object.
         */

        System.out.println(str.equals(str3));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str));
        System.out.println(str.equals(str));
        System.out.println(str3.equals(str3));
        System.out.println(str1.equals(str1));

        /*
         * boolean isEmpty()
         * It checks if string is empty.
         */

        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());

        // System.out.println(str3.isEmpty()); // don't applies on string Builder.

        /*
         * String concat(String str)
         * It concatenates the specified string.
         */
        /*
         * String replace(char old, char new)
         * It replaces all occurrences of the specified char value.
         */

    }
}
