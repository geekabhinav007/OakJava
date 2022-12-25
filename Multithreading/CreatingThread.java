// Creatin thread by Extending Thread class.

class MyThread3 extends Thread{
    @Override
    public void run(){
        int i = 1000;
        while(i>0){
        System.out.println("I am Cooking.");
        i--;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 1000;
        while(i>0){
        System.out.println("I am Playiing Game.");
        i--;
        }
    }
}
public class CreatingThread {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        
    }
}
