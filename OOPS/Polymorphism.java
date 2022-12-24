class poly {
    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }
    public float add(float a, float b) {     // Method Overloading

        return a + b;
    }
    public float add(float a, float b, float c) {    // Method Overloading

        return a + b + c;
    }
    public float add(int a, float b) {     // Method Overloading

        return a + b;
    }
    public int add(int a, int b, int c) {     // Method Overloading

        return a + b + c;
    }
}

public class Polymorphism {
public static void main(String[] args) {
    poly obj = new poly();
    System.out.println(obj.add(1,2));
    System.out.println(obj.add(1,2,3));
    System.out.println(obj.add(1.7f,2.6f));
    System.out.println(obj.add(1.9f,2.5f,4.6f));
    System.out.println(obj.add(1.9f,2));
}
}
