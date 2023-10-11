//this event is shown when mouse is clicked, pressed, released, move, exited from component
// to handle mouse event mouse listener interface should be used
// it has five methods which should be override
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseDemo extends JFrame{
    JTextArea t1;
    JLabel l1;
    public void setMouse(){
        t1 = new JTextArea(20, 40);
        l1 = new JLabel("Result");
        t1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e){
                //wehn mouse is clicked and immediately released
                l1.setText("Mouse clicked");
            }
            @Override
            public void mousePressed(java.awt.event.MouseEvent e){
                l1.setText("Mouse Pressed");
            }
            @Override
            public void mouseReleased(java.awt.event.MouseEvent e){
                l1.setText("Mouse Released");

            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e){
                //when mouse cursor is moved into component
                l1.setText("Mouse Entered into component");
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent e){
                //when mouse cursor moved away from component
                l1.setText("Mouse exited from component");
            }
            

        });
        add(t1);add(l1);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
}

public class MouseEvent {
    public static void main(String[] args) {
        MouseDemo m = new MouseDemo();
        m.setMouse();
    }
}
