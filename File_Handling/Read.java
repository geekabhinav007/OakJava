import java.util.*;
import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            File myfile = new File("Myfile.txt");
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
