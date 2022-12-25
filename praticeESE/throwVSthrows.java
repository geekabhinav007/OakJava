public class throwVSthrows {
    static int division(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 25;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception by throw keyword");
            throw e;
        } finally {
            try {
                System.out.println(division(a, b));
            } catch (Exception e) {
                System.out.println("Exception by Throws from division function.");
                e.printStackTrace();
            }
        }
    }
}