import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingComponentTwo extends JFrame{
    //COMBOBOX generate two types of event
    // action event : when combo box is clicked
    // item evetn : when item is selected from combobox
    JComboBox cb1;
    JLabel l1;
    public void setComponents(){
        String []country = {"Nepal" , "India", "China", "Pakistan", "Sri Lanka"};
        cb1 = new JComboBox(country);
        l1 = new JLabel("Result");
        add(cb1);add(l1);
        setVisible(true);
        setSize(200, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //HANDLING event generated from combobox: itemvent
        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                String item = (String)cb1.getSelectedItem();
                l1.setText("You selected " + item );
            }
        });
    }
}

public class Swing2 {
    public static void main(String[] args) {
        SwingComponentTwo st = new SwingComponentTwo();
        st.setComponents();
    }
}
