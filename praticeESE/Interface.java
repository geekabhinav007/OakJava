class abhinav{
void printname(){
    System.out.println("I am abhinav");
}
}
interface Phone {
    int port =5;
    void button();

    void battery();
    // Default keyword is used to incoperate definition of the method.
    default void simSlot(){
        System.out.println("I am a single sim Mobile with default behaviour.");
    }

}

interface Smartphone {
    void touch();

    void camera();
}

class motrolaG51 extends abhinav implements Phone, Smartphone {

    @Override
    public void button() {
        System.out.println("I Am button for power off/on");
    }

    @Override
    public void battery() {
        System.out.println("I am 5000maH bateery");
    }

    @Override
    public void touch() {
        System.out.println("I am 120Hz touch panel");
    }

    @Override
    public void camera() {
        System.out.println("I am 30Mpx Camera");
    }

}
class motrolaG51A implements Phone, Smartphone {
    @Override
    public void button() {
        System.out.println("I Am button for power off/on");
    }

    @Override
    public void battery() {
        System.out.println("I am 5000maH bateery");
    }

    @Override
    public void touch() {
        System.out.println("I am 120Hz touch panel");
    }

    @Override
    public void camera() {
        System.out.println("I am 30Mpx Camera");
    }
    @Override
    public void simSlot(){
        System.out.println("I am double sim Smartphone.");
    }

}

public class Interface {
    public static void main(String[] args) {
        motrolaG51 m51 = new motrolaG51();
        motrolaG51A m51A = new motrolaG51A();
        System.out.println(motrolaG51.port);
        m51.printname();
        m51.battery();
        m51.button();
        m51.camera();
        m51.touch();
        m51.simSlot();
        m51A.battery();
        m51A.button();
        m51A.camera();
        m51A.touch();
        m51A.simSlot();
        
    }
}
