import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//when key is pressed, released and clicked

class KeyDemo extends JFrame{
    JTextField t1;
    JLabel l1;
    public void setKeyEvent(){
        t1 = new JTextField(15);
        l1 = new JLabel("Result");
        t1.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //when key is continuously pressed
                l1.setText("Key Typed");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                l1.setText("Key Pressed");

            }

            @Override
            public void keyReleased(KeyEvent e) {
                l1.setText("Key Released ");

            }
            
        });
        add(t1);add(l1);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
}
public class KeyEventDemo {
    public static void main(String[] args) {
        KeyDemo k = new KeyDemo();
        k.setKeyEvent();
    }
}
