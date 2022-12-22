import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;

class Complex {
    int real, imaginary;

    Complex(int real, int imaginary) {
        System.out.println("Paramaterized Constructor call");
        this.real = real;
        this.imaginary = imaginary;

    }

    Complex(Complex C1) {
        System.out.println("Copy Constructor called");
        ;
        this.real = C1.real;
        this.imaginary = C1.imaginary;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        Complex Num1 = new Complex(5, 10);
        Complex Num2 = new Complex(Num1);
        System.out.println(Num1.real + " + " + Num1.imaginary + "i ");
        System.out.println(Num2.real + " + " + Num2.imaginary + "i ");

    }

}
