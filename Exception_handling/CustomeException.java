import java.util.*;

class MyException extends Exception {

    public String toString() {
        return " I am custom Exception under toString Function\n";
    }

    public String getMessage() {
        return " I am custom Exception Under getMessage Function\n";
    }
}

public class CustomeException {
    public static void main(String[] args) {
        int a = 25;
        if (a > 20) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e); // by defalut by e toString Function is called
                System.out.println(e.getMessage()); // 
            }
        }

    }
}
