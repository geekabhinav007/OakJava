

import java.io.File;

public class Create {
    public static void main(String[] args) {
        File newFile = new File("Myfile2.txt");
        try{
        newFile.createNewFile();
        System.out.println("File Created");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
