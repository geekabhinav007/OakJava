
class Sample {
    void fun() {
        System.out.println("Inside Sample's fun method.");
    }
}

class Test extends Sample {
    void foo() {
        System.out.println("Inside Test's foo method.");
    }
}

class Result extends Sample {
    void foo() {
        System.out.println("Inside display method of Result class.");
    }
}

class Example extends Test implements Result{

    void display() {
        System.out.println("Inside display method of Example class");
    }
}

public class HybridInheritance {

    public static void main(String args[]) {
        Example e = new Example();
        e.foo(); // Ambiguity
    }
}