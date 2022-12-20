class Recursion {

  static int factorial_of_number(int n) {
    if (n <= 1) return 1;
    return n * factorial_of_number(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(
      "Name: Kumar Abhinav\nURN: 2004825\nCRN: 2021142\nClass: ITB2(5th sem, 3rd year) "
    );
    int m = 5;
    System.out.println(factorial_of_number(10));
  }
}
