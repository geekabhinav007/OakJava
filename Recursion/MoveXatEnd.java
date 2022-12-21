public class MoveXatEnd {
    static int count = 0;
    static StringBuilder newstr = new StringBuilder("");
    public static void moveXatEnd(String str, int index) {
        
        if (str.length() == index) {
            for (int i = 0; i < count; i++) {
                newstr.append("x");
            }
            System.out.println(newstr);
            return;
        }
        if (str.charAt(index) != 'x') {
            char temp = str.charAt(index);
            newstr.append(temp);
        } else {
            count++;
        }
        moveXatEnd(str, index+1);
    }

    public static void main(String[] args) {
        String str = "abcxfyxuioxehjkxmxxio";
        moveXatEnd(str, 0);
    }
}
