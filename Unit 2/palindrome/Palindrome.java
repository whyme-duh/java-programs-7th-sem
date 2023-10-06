import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Check extends JFrame{
    JLabel l1;
    JTextField t1,t2;
    JButton b1,b2,b3;

    public void Checking(){
        l1 = new JLabel("Input any String: ");
        t1= new JTextField(10);
        t2= new JTextField(10);
        b1 = new JButton("Check Palindrome");
        b2 = new JButton("Reverse");
        b3 = new JButton("Find Vowel");

        add(l1);add(t1);
        add(b1);add(b2);add(b3);
        add(t2);
     

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String data = t1.getText();
                String rev = "";
                for(int i =(data.length()-1);i>=0;i--){
                    rev = rev + data.charAt(i);
                }
                if(data.equalsIgnoreCase(rev)){
                    t2.setText("String is Palindrome");
                }
                else{
                    t2.setText("String is not Palindrome");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String data = t1.getText();
                String rev = "";
                for(int i =(data.length()-1);i>=0;i--){
                    rev = rev + data.charAt(i);
                }
                t2.setText(rev);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String []vowel ={"a", "e", "i","o","u"};
                String data = t1.getText();
                String res = "";
                for(int i =0;i<=(data.length());i++){
                    if(data.charAt(i) == 'a' ||data.charAt(i) == 'e' || data.charAt(i) == 'i' ||data.charAt(i) == 'o' ||data.charAt(i) == 'u'){
                        res += data.charAt(i);
                        t2.setText(res);

                    }
                }
            }
        });


        setVisible(true); //displaying window
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}

public class Palindrome {
    public static void main(String[] args) {
        Check c = new Check();
        c.Checking();
    }
}


