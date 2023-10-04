// menu bar is a tab that contains sequence of items known as menu 
// menu contains collection of items known as menu item
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Menu extends JFrame{
    public void setMenu(){
        //creating menu bar
        JMenuBar menu = new JMenuBar();
        //creating first menu
        JMenu menuItemOne = new JMenu("File");
        //adding nmemoic: shortcut key
        menuItemOne.setMnemonic('f');
        //creating menu item in first menu item
        JMenuItem mi1 = new JMenuItem("Open", 'o');
        JMenuItem mi2 = new JMenuItem("Save",'s');
        JMenuItem mi3 = new JMenuItem("Save as",'a');
        JMenuItem mi4 = new JMenuItem("Exit",'e');
        //adding item in menu item one
        menuItemOne.add(mi1);menuItemOne.add(mi2);menuItemOne.add(mi3);menuItemOne.add(mi4);
        //adding menu on menu bar
        menu.add(menuItemOne);
        //adding branching : adding subcompoent on particular menu item
        JMenu submenu = new JMenu("New");
        JMenuItem submenuitem = new JMenuItem("Open in same folder");
        JMenuItem submenuitemtwo = new JMenuItem("Open in different folder");
        submenu.add(submenuitem);submenu.add(submenuitemtwo);
        menuItemOne.add(submenu);
        //checkbox
        JMenu m3 = new JMenu("Edit");
        JCheckBoxMenuItem c1 = new JCheckBoxMenuItem("Copy", true);
        JCheckBoxMenuItem c2 = new JCheckBoxMenuItem("Paste");
        JCheckBoxMenuItem c3 = new JCheckBoxMenuItem("Cut");
        m3.add(c1);m3.add(c2);m3.add(c3);
        menu.add(m3);
        // radio button
        JMenu m4 = new JMenu("View");
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("ZOOM");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("StatusBar");
        m4.add(r1);m4.add(r2);
        menu.add(m4);
        
        add(menu);//adding menu bar in JFrame
        setVisible(true);
        setSize(400, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);

     

    }
}
public class MenuBarDemo {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setMenu();
    }   
}
