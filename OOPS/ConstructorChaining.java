

public class ConstructorChaining {
    ConstructorChaining(){
        this(100);
        System.out.println("Default Constructor");
    }
    ConstructorChaining(int x){
        this (100,5);
        System.out.println("Constructor With Single Parameter");
    }
    ConstructorChaining(int x, int y){
        System.out.println("Constructor with two Parameter, Multiplication of parameter is " + x*y);
    }
    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
