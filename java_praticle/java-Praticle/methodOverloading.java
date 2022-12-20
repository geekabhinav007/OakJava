class Adder {

  static int add(int a, int b) {
    return a + b;
  }

  static int add(int a, int b, int c) {
    return a + b + c;
  }
}

class methodOverloading {

  public static void main(String[] args) {
    System.out.println(
      "Name: Kumar Abhinav\nURN: 2004825\nCRN: 2021142\nClass: ITB2(5th sem, 3rd year) "
    );
    System.out.println(Adder.add(11, 11));
    System.out.println(Adder.add(11, 11, 11));
  }
}
