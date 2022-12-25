
public class Append {
    public static void main(String[] args) {
        String strin = new String();
        String str1 = "Abhi is";
        String str2 = " also nav";
        // Method -1

        String finalString = str1 + str2;
        System.out.println(finalString);

        // Method -2

        String str = str1.concat(str2);
        System.out.println(str);

        // Method - 3

        System.out.println(String.join("", str1, str2));

    }
}
