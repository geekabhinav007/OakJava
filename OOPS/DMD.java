
class abhinav{
public void printstat(){
    System.out.println(" I am inside Abhinav");
}
}
class abhi extends abhinav{
    public void printstat(){
        System.out.println(" I am inside abhi");
    }
}
public class DMD {
    public static void main(String[] args) {
        abhinav obj1 = new abhi();
        obj1.printstat();
        abhi obj2 = new abhi();
        obj2.printstat();
        abhinav obj3 = new abhinav();
        obj3.printstat();
        //abhi obj4 = new abhinav();
        
        
    }
}
