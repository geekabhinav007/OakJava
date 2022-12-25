class MyThread implements Runnable {
     // Implemanting using Runnable Interface.
    public void run() {
        System.out.println("Thanks, I am a Thread.");
    }
}

public class ThreadCreation {
    public static void main(String[] args) {    
    MyThread a1 = new MyThread();
    Thread t1 = new Thread(a1);
    t1.start();
    }
}
