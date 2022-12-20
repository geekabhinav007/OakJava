public class Switch {
    public static void main(String[] args) {
        System.out.println(
      "Name: Kumar Abhinav\nURN: 2004825\nCRN: 2021142\nClass: ITB2(5th sem, 3rd year) "
    );
       
     int mnth = 6;
     switch (mnth) {
      case 1:
       System.out.println("Showing Month: January");
       break;
      case 2:
       System.out.println("Showing Month: February");
       break;
      case 3:
       System.out.println("Showing Month: March");
       break;
      case 4:
       System.out.println("Showing Month: April");
       break;
      case 5:
       System.out.println("Showing Month: May");
       break;
      case 6:
       System.out.println("Showing Month: June");
       break;
      case 7:
       System.out.println("Showing Month: July");
       break;
      case 8:
       System.out.println("Showing Month: August");
       break;
      case 9:
       System.out.println("Showing Month: September");
       break;
      case 10:
       System.out.println("Showing Month: October");
       break;
      case 11:
       System.out.println("Showing Month: November");
       break;
      case 12:
       System.out.println("Showing Month: December");
       break;
      default:
       System.out.println("Invalid input - Wrong month number.");
       break;
     }
    }
}