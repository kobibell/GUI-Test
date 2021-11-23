package gui.test;

import static java.awt.Color.BLUE;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUITest 
{

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame ("Hello!");
        frame.setSize(300,300);
        frame.setLocation(0,0);
        frame.setBackground(BLUE);
        frame.setVisible(true);
        
    }
    
}
