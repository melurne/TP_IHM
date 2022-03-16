package tp1;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class test {

    public static Color getBackgroundColor(String theme) {
        return theme == "dark" ? Color.BLACK : Color.WHITE ;
    }
    
    public static Color getFontColor(String theme) {
        return theme == "dark" ? Color.WHITE : Color.BLACK ;
    }

    public static void main(String args[]) {

        final String[] theme = {"dark"};

        JFrame win = new JFrame();
        win.getContentPane().setLayout(new BorderLayout());
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // BODY ---------------------------------------------------------------
        JTextPane textArea = new JTextPane();
        JScrollPane body = new JScrollPane(textArea);
        body.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        textArea.setBackground(getBackgroundColor(theme[0]));
        textArea.setForeground(getFontColor(theme[0]));

        
        // TASK BAR -----------------------------------------------------------
        JMenuBar taskBar = new JMenuBar();
        taskBar.setLayout(new BoxLayout(taskBar, BoxLayout.X_AXIS));
        taskBar.setBackground(Color.LIGHT_GRAY);

        JMenu tasks = new JMenu("Fichier");
        JMenuItem nouveau = new JMenuItem("Nouveau"); nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK)); 
        nouveau.addActionListener((e) -> {System.out.println("Nouveau");});

        JMenuItem ouvrir = new JMenuItem("Ouvrir"); ouvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK)); 
        ouvrir.addActionListener((e) -> {System.out.println("Ouvrir");});

        JMenuItem enregistrer = new JMenuItem("Enregistrer"); enregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK)); 
        enregistrer.addActionListener((e) -> {System.out.println("Enregistrer");});

        JMenuItem enregistrersous = new JMenuItem("Enregistrer sous"); enregistrersous.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK)); 
        enregistrersous.addActionListener((e) -> {System.out.println("Enregistrer sous");});

        JMenuItem miseEnPage = new JMenuItem("Mise en page");
        JMenuItem imprimer = new JMenuItem("Imprimer");
        JMenuItem quitter = new JMenuItem("Quitter");

        tasks.add(nouveau);
        tasks.add(ouvrir);
        tasks.add(enregistrer);
        tasks.add(enregistrersous);
        tasks.addSeparator();
        tasks.add(miseEnPage);
        tasks.add(imprimer);
        tasks.addSeparator();
        tasks.add(quitter);

        JMenu edition = new JMenu("Edition");


        JMenu format = new JMenu("Format");
        JMenuItem darkTheme = new JMenuItem("Dark Theme"); darkTheme.addActionListener((e) -> {theme[0] = theme[0] == "dark" ? "light" : "dark"; textArea.setBackground(getBackgroundColor(theme[0]));
        textArea.setForeground(getFontColor(theme[0]));});

        format.add(darkTheme);

        taskBar.add(tasks);
        taskBar.add(edition);
        taskBar.add(format);

        

        // FOOTER -------------------------------------------------------------
        JPanel footer = new JPanel();
        footer.setLayout(new FlowLayout(FlowLayout.LEFT));
        footer.setBackground(Color.LIGHT_GRAY);

        JLabel recherche = new JLabel("Rechercher : ");
        JTextField searchBar = new JTextField(); searchBar.setColumns(10);
        JButton left = new JButton("<");
        JButton right = new JButton(">");
        JButton highlight = new JButton("Tout surligner");


        footer.add(recherche);
        footer.add(searchBar);
        footer.add(left);
        footer.add(right);
        footer.add(highlight);




        win.getContentPane().add(taskBar, BorderLayout.NORTH);
        win.getContentPane().add(body, BorderLayout.CENTER);
        win.getContentPane().add(footer, BorderLayout.SOUTH);


        win.setPreferredSize(new Dimension(400, 300));
        win.setVisible(true);        
        win.pack();

        win.setLocationRelativeTo(null);


    }
}
