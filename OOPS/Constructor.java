
class Car{
    String color;
    int cost;
    // Parametrised Constructor
    Car(String color, int cost){
        this.color = color;
        this.cost = cost;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Car hondacity = new Car("Black", 100000);
        System.out.println(hondacity.color + " " + hondacity.cost);
        
    }
}
