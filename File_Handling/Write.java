import java.io.*;

public class Write {
    public static void main(String[] args) {

        try {
            FileWriter myFile = new FileWriter("Myfile.txt");
            myFile.write("I am abhinav and I wants to \n write in this file\n Thanks.");
            System.out.println("Writing done.");
            myFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
