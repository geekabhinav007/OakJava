public class Fibbonic {
    // 0 1 1 2 3 5 8 13
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int no_Terms = 3;
        if (no_Terms >= 1) {
            System.out.println(a);
            if (no_Terms >= 2) {
                System.out.println(b);
            }

        }
        for (int i = 2; i < no_Terms; i++) {
            int fibb = a + b;
            System.out.println(fibb);

            // a --> b
            // b --> fibb
            a = b;
            b = fibb;

        }
    }
}
