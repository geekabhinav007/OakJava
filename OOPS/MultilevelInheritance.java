class Human{
    int averageSleepPerDay = 8;
    public void sleep(){
        System.out.println("Human Can sleep");
    }

}
class Engineer extends Human{
   
    public void eat(){
        System.out.println("Engineer can Eat");
    }
    public void inovate(){
        System.out.println("Engineer can Create inovation");
    }
    
}

class Coder extends Engineer{
    int averageSleepPerDay = 3;
    public void sleep(){
        System.out.println("Coder Can't sleep Much");
    }
    

}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Coder abhinav = new Coder();
        System.out.println(abhinav.averageSleepPerDay);
        abhinav.sleep();
        abhinav.eat();
        abhinav.sleep();
        abhinav.inovate();
    }
    
}
