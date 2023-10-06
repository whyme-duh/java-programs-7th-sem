import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculate extends JFrame{
    JLabel l1, l2, l3;
    JTextField t1,t2,t3, t4;
    JButton b1;

    public void setValues(){
        l1 = new JLabel("Enter Principle");
        l2 = new JLabel("Enter Time");
        l3 = new JLabel("Enter Rate");
        b1 = new JButton("Calculate Interest");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b1);
        add(t4);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int principle = Integer.parseInt(t1.getText());
                int time = Integer.parseInt(t2.getText());
                int rate =Integer.parseInt(t2.getText());

                int simpleinterest= ( principle*time*rate)/100;
                t4.setText("=" + simpleinterest);
            }
        });


        setVisible(true); //displaying window
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}

public class SimpleInterest {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.setValues();
    }
}
