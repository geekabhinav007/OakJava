import java.io.*;
import java.util.*;

public class Delete {
   public static void main(String[] args) {
    try {
        File myFile = new File("Myfile2.txt");
        myFile.delete();
        System.out.println("File Deleted.");
    } catch (Exception e) {
        System.out.println(e);
    }
   }
    
}
