class MultidimensionalArray {

  public static void main(String[] args) {
    System.out.println(
      "Name: Kumar Abhinav\nURN: 2004825\nCRN: 2021142\nClass: ITB2(5th sem, 3rd year) "
    );
    // create a 2d array
    int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 } };

    // calculate the length of each row
    System.out.println("Length of row 1: " + a[0].length);
    System.out.println("Length of row 2: " + a[1].length);
    System.out.println("Length of row 3: " + a[2].length);
  }
}
