import javax.swing.text.html.StyleSheet;

public class Duplicate {
    public static boolean[] map = new boolean[26];
    public static StringBuilder newstr = new StringBuilder("");

    public static void duplicate(String str, int index) {
        if (str.length() == index) {
            System.out.println(newstr);
            return;
        }
        int mapIndex = str.charAt(index) - 'a';
        if (map[mapIndex] == false) {
            newstr.append(str.charAt(index));
            map[mapIndex] = true;
            duplicate(str, index + 1);
        } else {
            duplicate(str, index + 1);
        }
    }
    public static void main(String [] args){
        String str = "aabbccddeeabcde";
        duplicate(str, 0);

    }
}
