// place the component as a sequence of card i.e,. one component is place
// behind another and only one component is show at a time

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Cards extends JFrame{
    JButton b1, b2, b3, b4;
    JPanel p1; // small window
    public void setCards(){
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        p1 = new JPanel();
        CardLayout cl = new CardLayout();
        p1.setLayout(cl);
        add(p1);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(3);
        //adding compoment
        p1.add(b1, "button1");
        p1.add(b2, "button2");
        p1.add(b3, "button3");
        p1.add(b4, "button4");
        //showing next component
        // cl.next(p1);
        //showing previous compon et
        // cl.previous(p1);
        //showing component of own choice
        cl.show(p1, "button2");

    }
}

public class CardLayoutDemo {
    public static void main(String[] args) {
        Cards c = new Cards();
        c.setCards();
    }
}
