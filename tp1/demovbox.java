package tp1;

/**
 * demovbox.java
 *
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 * @version
 */

import java.awt.*;
import javax.swing.*;

    public class demovbox {

  public static void main(String args[]) {
      // Creation de la fenetre
      JFrame fenetre = new JFrame("JFrame");
      fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
      fenetre.setLocation(100,100);

      fenetre.setLayout(new VboxLayout());
      fenetre.add(new JButton("Bouton 1"));
      fenetre.add(new JButton("Tres long bouton 2"));
      fenetre.add(new JButton("Super super long bouton 3"));
      fenetre.add(new JButton("Court bouton 4"));

      fenetre.setVisible(true);
      fenetre.pack();
  }
    }
