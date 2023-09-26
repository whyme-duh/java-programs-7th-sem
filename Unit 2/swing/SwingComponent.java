import javax.swing.*;
import java.awt.*;

class SwingControls extends JFrame{
    JLabel l1, l2 ,l3, l4, l5;
    JTextField t1;
    JPasswordField p1,p2;
    JRadioButton r1, r2;
    JCheckBox c1, c2,c3;
    JButton s1;

    public void setControls(){
        l1 = new JLabel("username");
        l2 = new JLabel("password");
        l3 = new JLabel("re-password");
        l4 = new JLabel("gender");
        l5 = new JLabel("course");
        t1= new JTextField(20);
        p1 = new JPasswordField(20);
        p2 = new JPasswordField(20);
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Php");
        c3 = new JCheckBox("DBMS");
        s1 = new JButton("Submit");
        
        //adding button group for radio button
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);
        // adding components to window
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(s1);
       
        //addming features of window
        setVisible(true); //displaying window
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // if cancel button is pressed, program is closed

    }
}


public class SwingComponent {
    public static void main(String[] args) {
        SwingControls sc = new SwingControls();
        sc.setControls();
    }
}
