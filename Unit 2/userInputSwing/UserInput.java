import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class UserInputDemo extends JFrame{
    JLabel l1, l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    public void setInput(){
        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter second number");
        l3 = new JLabel("Result");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Sum");
        b2 = new JButton("Multiply");
        b3 = new JButton("Division");

        //addming componet into window
        add(l1); add(t1);
        add(l2);add(t2);
        add(b1);add(b2);add(b3);
        add(l3);

        //addming window specification
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //handling event generated from the buttons
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int first = Integer.parseInt(t1.getText());
                int second = Integer.parseInt(t2.getText());
                int sum= first + second;
                l3.setText("Sum is " + sum);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int first = Integer.parseInt(t1.getText());
                int second = Integer.parseInt(t2.getText());
                int multiply= first * second;
                l3.setText("Multiplication is " + multiply);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int first = Integer.parseInt(t1.getText());
                int second = Integer.parseInt(t2.getText());
                int division= first / second;
                l3.setText("Division is " + division);
            }
        });

    }



}

public class UserInput{
    public static void main(String[] args) {
        UserInputDemo ui = new UserInputDemo();
        ui.setInput();
    }
}
