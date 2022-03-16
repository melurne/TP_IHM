package tp1;

import java.awt.*;
import javax.swing.*;
import javax.swing.Box.Filler;

public class test {
    public static void main(String args[]) {
        JFrame win = new JFrame();
        win.getContentPane().setLayout(new BoxLayout(win.getContentPane(), BoxLayout.Y_AXIS));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        win.getContentPane().add(Box.createHorizontalGlue());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        Filler filler = new Filler(null, null, null);

        win.getContentPane().add(button1);
        win.getContentPane().add(button2);
        win.getContentPane().add(filler);
        win.getContentPane().add(button3);
        
        button1.add(Box.createHorizontalGlue());
        button1.add(Box.createVerticalGlue());
        
        filler.add(Box.createHorizontalGlue());
        filler.add(Box.createVerticalGlue());

        button2.add(Box.createHorizontalGlue());
        button2.add(Box.createVerticalGlue());
        
        button3.add(Box.createHorizontalGlue());
        button3.add(Box.createVerticalGlue());
    

        win.setPreferredSize(new Dimension(400, 300));
        win.setVisible(true);        
        win.pack();

        win.setLocationRelativeTo(null);


    }
}
