import javax.swing.*;
import java.awt.*;

class PopUp extends JFrame{
    public void setPopup(){
        JPopupMenu popmenu = new JPopupMenu();
        JMenuItem i1 = new JMenuItem("View");
        JMenuItem i2 = new JMenuItem("Sort By");
        JMenuItem i3 = new JMenuItem("Refresh");
        popmenu.add(i1);popmenu.add(i2);popmenu.add(i3);
        add(popmenu);
        setVisible(true);
        setSize(400, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        popmenu.show(this, 150, 125 );

    }
}
public class PopUpMenuDemo {
    public static void main(String[] args) {
        PopUp p = new PopUp();
        p.setPopup();
    }
}
