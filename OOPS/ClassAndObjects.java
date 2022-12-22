public class ClassAndObjects {
public String school = "ABC";
public static void main(String[] args) {
   
    Student s1 = new Student();
    s1.age = 22;
    s1.name = "Abhinav";
    System.out.println(s1);
    System.out.println(s1.age);
    System.out.println(s1.name);

  }
  
}
class Student{
    String name;
    int age;
}