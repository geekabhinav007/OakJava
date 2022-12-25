abstract class Car {
    public void color() {
        System.out.println("I am Black in Color");
    }

    abstract void wheel();

    abstract void engine();
}


class Thar extends Car {
    void wheel() {
        System.out.println("It has 4 wheel.");
    }

    void engine() {
        System.out.println("It has 400 HP engine.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Thar thar = new Thar();
        thar.color();
        thar.wheel();
        thar.engine();
    }

}
