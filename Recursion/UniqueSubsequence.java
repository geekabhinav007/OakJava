import java.util.*;
public class UniqueSubsequence {
    public static void uniqueSubsequence(String str,int idx,String newstr, HashSet<String> set){
        if(str.length()== idx){
            if(set.contains(newstr)){
                return;
            }else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        // Include
        uniqueSubsequence(str,idx+1, newstr+str.charAt(idx), set);
        // Exclude
        uniqueSubsequence(str,idx+1, newstr, set);

    }
    public static void main(String [] args){
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence(str,0, "", set);
    }
}
