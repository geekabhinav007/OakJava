import java.applet.*;
import java.awt.*;

public class TryingApplets extends Applet {
    // Label for 2 inputs and one final output as a sum;
    Label l1, l2, l3;
    // Two text field for inputs
    TextField t1, t2;
    // one button :- initiate button to calculate sum.
    Button button;

    public void init() {
        l1 = new Label("First Number"); // Name Labels
        l1 = new Label("Second Number"); // Name Labels
        l3 = new Label(); // Empty Label where sum will be stored after button got clicked.
        t1 = new TextField(); // text field where value of 'a' will be inputed
        t2 = new TextField(); // text field where value of 'b' will be inputed
        button = new Button("Add"); // add buton to add values of 'a' and 'b'.
        setLayout(null); // Reset default layout of applet.

        /*
         * x the new x-coordinate of this component
         * 
         * y the new y-coordinate of this component
         * 
         * width the new width of this component
         * 
         * height the new height of this component
         */

        l1.setBounds(30, 50, 100, 20); // set layout using cordinate
        l2.setBounds(30, 100, 100, 20); // (int x, int y, int width, int height)

        t1.setBounds(150, 50, 100, 20); // (int x, int y, int width, int height)
        t2.setBounds(150, 100, 100, 20); // (int x, int y, int width, int height)
        button.setBounds(100, 150, 80, 20); // (int x, int y, int width, int height)
        l3.setBounds(30, 180, 100, 20); // (int x, int y, int width, int height)
        add(l1); //add these field in actual in above we defined and now we are adding
        add(l2); //add these field in actual in above we defined and now we are adding
        add(t1); //add these field in actual in above we defined and now we are adding
        add(t2); //add these field in actual in above we defined and now we are adding
        add(button); //add these field in actual in above we defined and now we are adding
        button.addActionListener(new MyHandler()); 
         /*
         * passed a object for event listning of
         * button and definition of this button is handled in below code.
         * add(l3);
         */

        add(l3);
    }

    public void actionPerformed(ActionEvent e) {
        int a, b, s;
        a = Integer.parseInt(t1.getText()); // store input from input field to 'a' as string and typecast to integer.
        b = Integer.parseInt(t2.getText()); // // store input from input field to 'b' as string and typecast to integer.
        s = a + b; // sum
        l3.setText("sum is " + s); // set value of label l3 

    }

}
