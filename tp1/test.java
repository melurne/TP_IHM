package tp1;

import java.awt.*;
import javax.swing.*;

public class test {
    public static void main(String args[]) {
        JFrame win = new JFrame();

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton north = new JButton("North");
        JButton center = new JButton("Center");
        JButton south = new JButton("South");
        JButton west = new JButton("West");
        JButton east = new JButton("East");

        win.getContentPane().add(north, BorderLayout.NORTH);
        win.getContentPane().add(center, BorderLayout.CENTER);
        win.getContentPane().add(south, BorderLayout.SOUTH);
        win.getContentPane().add(west, BorderLayout.WEST);
        win.getContentPane().add(east, BorderLayout.EAST);

        win.setPreferredSize(new Dimension(400, 300));
        win.setVisible(true);        
        win.pack();

        win.setLocationRelativeTo(null);


    }
}
