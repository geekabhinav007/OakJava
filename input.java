import java.net.SocketPermission;
import java.util.*;
public class input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();

        System.out.println(name + " is "+ age +" Years old.");
    }
}
