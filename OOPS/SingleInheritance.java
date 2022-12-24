
class Human {
    public int age;

    public void getAge(int age) {
        System.out.println("I am of Human Class and my age is " + age);
    }
}

class Coder extends Human {
    public void eat() {
        System.out.println("I am Eating.");
    }

    public void sleep() {
        System.out.println("I am Sleeping.");
    }

    public void Code() {
        System.out.println("I am Coding.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Coder abhinav = new Coder();
        int x = 21;
        abhinav.getAge(x);
        abhinav.sleep();
        abhinav.eat();
        abhinav.Code();

    }
}
