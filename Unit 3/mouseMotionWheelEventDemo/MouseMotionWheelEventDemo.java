// mouse motion event is thrown when mouse is dragged and moved in component
//mouse wheel event is thrown when mouse wheel is moved

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseWheelDemo extends JFrame{
    JTextArea t1;
    JLabel l1;
    public void setMouseMotion(){
        t1 = new JTextArea(20,40);
        l1 = new JLabel("result");
        t1.addMouseMotionListener(new MouseMotionListener() {
           
            @Override
            public void mouseDragged(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                l1.setText("Mouse dragged at" + e.getX()+e.getY()); 
            }
            @Override
            public void mouseMoved(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                l1.setText("Mouse moved at" + e.getX()+e.getY());             
            }
        });
        t1.addMouseWheelListener(new MouseWheelListener() {

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                l1.setText("Mouse WHEEL MOVED at " + e.getX()+e.getY());             

            }
            
        });
        add(t1);add(l1);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
    }
}
public class MouseMotionWheelEventDemo {
    public static void main(String[] args) {
        MouseWheelDemo mw = new MouseWheelDemo();
        mw.setMouseMotion();
    }
}
