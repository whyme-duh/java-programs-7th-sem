import javax.swing.*;
import java.awt.*;

class Splits extends JFrame{
    JComboBox c1;
    JTextField b1;
    JPanel p1,p2;
    public void setSplit(){
        String []players = {"messi" , "ronaldo" , "neymar" , "bale", " kaka"};
        c1 = new JComboBox<>(players);
        b1 = new JTextField(20);
        p1 = new JPanel();
        p2 = new JPanel();

        p1.add(c1);p2.add(b1);
        //creating splitpane
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1,p2);
        // to collapse and release component
        sp.setOneTouchExpandable(true);
        //to maintain gap
        sp.setDividerSize(20);
        add(sp);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);

    }
}

public class SplitPaneDemo {
    public static void main(String[] args) {
        Splits s = new Splits();
        s.setSplit();
    }
}
