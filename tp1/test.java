package tp1;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class test {
    public static void main(String args[]) {
        JFrame win = new JFrame();
        win.getContentPane().setLayout(new BorderLayout());
        win.getContentPane().add(new JLabel("Hello World"), BorderLayout.CENTER);
        win.setLocation(100,100);

        win.setPreferredSize(new DimensionUIResource(400, 300));

        win.setVisible(true);        
        win.pack();
        win.setLocationRelativeTo(null);

    }
}
