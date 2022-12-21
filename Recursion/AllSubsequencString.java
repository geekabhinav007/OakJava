public class AllSubsequencString {
    public static void subsequence(String str, int index, String newstr){
        if(str.length() == index){
            System.out.println(newstr);
            return;
        }
        // Include 
        subsequence(str, index+1, newstr+str.charAt(index));

        // Not included
        subsequence(str, index+1, newstr);
    }
    public static void main(String [] args){
        String str = "abcd";
        subsequence(str, 0, "");
    }
}
