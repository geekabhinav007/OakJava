import java.applet.*;
import java.awt.*;

public class TryingApplets extends Applet {
    Label l1, l2,l3;
    TextField t1, t2;
    Button button;

    public void init() {
        l1 = new Label("First Number");
        l1 = new Label("Second Number");
        l3 = new Label();
        t1 = new TextField();
        t2 = new TextField();
        button = new Button("Add");
        setLayout(null);
        l1.setBounds(30, 50, 100, 20);
        l2.setBounds(30, 100, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        t2.setBounds(150, 100, 100, 20);
        button.setBounds(100, 150, 80, 20);
        l3.setBounds(30,180,100,20);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(button);
        button.addActionListener(new MyHandler());
        add(l3);
    }
    public void actionPerformed(ActionEvent e){
        int a,b,s;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        s = a+b;
        l3.setText("sum is "+ s);
        
    }

}
