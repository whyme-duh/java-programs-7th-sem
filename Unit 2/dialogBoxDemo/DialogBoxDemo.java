import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Dialog {
    
    public void setDialog(){
        JFrame jf = new JFrame();
        // JOptionPane.showMessageDialog(jf, "Hello Guyssssss!");
        // //warning message
        // JOptionPane.showMessageDialog(jf, "Error", "Warning.", JOptionPane.WARNING_MESSAGE);

        // //INPUT MESSAGE
        // JOptionPane.showInputDialog(jf, "This is just a input", "Place Input", 0, null, null, jf);
        // JOptionPane.showConfirmDialog(jf, "Are you sure?", "Confirm?", 0);

        //using JDialog
        JButton b1 = new JButton("Click Me");
        jf.add(b1);
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(3);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog da = new JDialog(jf, "This is a box");
                da.setVisible(true);
                da.setSize(100,200);
                da.add(new JLabel("Welcome"));
                da.setDefaultCloseOperation(3);
            }
        });
    }
}

public class DialogBoxDemo {
    public static void main(String[] args) {
        Dialog d = new Dialog();
        d.setDialog();
    }
}
