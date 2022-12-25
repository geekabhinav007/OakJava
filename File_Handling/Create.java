

import java.io.File;
import java.io.IOException;

public class Create {
    // public static void main(String[] args) throws IOException {
    //     File newFile = new File("Myfile2.txt");
        
    //     newFile.createNewFile();
    //     System.out.println("File Created");
        
       
    // }
    public static void main(String[] args)  {
        File newFile = new File("Myfile2.txt");
        
        try {
            newFile.createNewFile();
        } catch (Exception e) {
            
            System.out.println(e);
        }
        System.out.println("File Created");
        
       
    }
    
}
