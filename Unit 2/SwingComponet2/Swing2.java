import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


class SwingComponentTwo extends JFrame{
    //COMBOBOX generate two types of event
    // action event : when combo box is clicked
    // item evetn : when item is selected from combobox
    JComboBox cb1;
    JLabel l1;

    // JList : contains list of item with scroll bar
    // it throws list selection event when selection is done
    JList<String> jl1;
    JLabel l2; 

    public void setComponents(){
        String []country = {"Nepal" , "India", "China", "Pakistan", "Sri Lanka"};
        cb1 = new JComboBox(country);
        l1 = new JLabel("Result");
        String []players = {"CR7", "LM10", "N10", "H10", "Pele" , "Pogba" , "Talisca"};
        jl1 = new JList(players);
        l2 = new JLabel("Players ");
        jl1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // multiple value can be selected
        JScrollPane sp = new JScrollPane();
        sp.add(jl1); // adming list into scrollbar
        add(cb1);add(l1);
        add(jl1);add(l2);
        setVisible(true);
        setSize(500, 500);
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

        // handling event generate from list 
        // list throws list selection event
        jl1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                ArrayList<String> listitem =(ArrayList <String>)jl1.getSelectedValuesList();
                for(String r1:listitem){
                    l2.setText("You selected : " + r1 + ",");
                }
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
