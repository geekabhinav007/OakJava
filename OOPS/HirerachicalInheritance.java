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
    void display() {
        System.out.println("Inside display method of Result class.");
    }
}

class Example extends Sample {
    void display() {
        System.out.println("Inside display method of Example class");
    }
}

public class HirerachicalInheritance {
    public static void main(String[] args) {
        Example example = new Example();
        Result result = new Result();
        Test test = new Test();
        example.display();
        example.fun();

        test.foo();
        test.fun();

        result.fun();
        result.display();

    }
}
