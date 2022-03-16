package tp1;

import java.awt.*;
import javax.swing.*;

public class test {
    public static void main(String args[]) {
        JFrame win = new JFrame();
        win.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i<16; i++) {
            win.getContentPane().add(new JButton("Button" + i));
        }

        win.setPreferredSize(new Dimension(400, 300));
        win.setVisible(true);        
        win.pack();

        win.setLocationRelativeTo(null);


    }
}
