import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//divide the window into 5 parts: Sourth, North, East and West
class Border extends JFrame{
    JButton b1, b2,b3,b4;
    JTextArea t1;
    public void setBorder(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        t1 = new JTextArea(20, 40);
        setVisible(true);
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(3);
        //adding component into frame using border Layout
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.SOUTH);
        add(b4, BorderLayout.WEST);
        add(t1, BorderLayout.CENTER);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("North button is clicked!");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("East button is clicked!");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("South button is clicked!");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("West button is clicked!");
            }
        });
    }
}


public class ModelLayoutDemo {
    public static void main(String[] args) {
        Border b = new Border();
        b.setBorder();
    }
}
