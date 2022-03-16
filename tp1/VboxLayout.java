package tp1;

/**
 * demovbox.java
 *
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 * @version
 */

import java.awt.*;

public class VboxLayout implements LayoutManager {
    // espace vertical entre chaque compant
    private int vgap;
    // largeur et hauteur minimales du conteneur
    private int minWidth = 400, minHeight = 300;
    // largeur et hauteur preferees du conteneur
    private int preferredWidth = 400, preferredHeight = 300;

    public VboxLayout() {
        this(2);
    }

    public VboxLayout(int v) {
        vgap = v;
    }

    /* Required by LayoutManager. */
    public void addLayoutComponent(String name, Component comp) {
  // Rien a remplir ici
    }

    /* Required by LayoutManager. */
    public void removeLayoutComponent(Component comp) {
  // Rien a remplir ici
    }

    private void setSizes(Container parent) {
  // nombre de composants du conteneur
        int nComps = parent.getComponentCount();

        //Reset de preferred/minimum width and height.
        preferredWidth = 400;
        preferredHeight = 300;
        minWidth = 400;
        minHeight = 300;

  // Ecrire le code qui permet de calculer les dimensions minimales et
  // preferrees du conteneur en utilisant les dimensions des differents
  // composants qu'il contient

    }


    /* Required by LayoutManager. */
    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(preferredWidth, preferredHeight);
 
  // Retourne les dimensions preferees du conteneur en utilisant
  // preferredWidth et preferredHeight ainsi que les dimensions du bord
  // du conteneur (Insets)

        return dim;
    }

    /* Required by LayoutManager. */
    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(minWidth, minHeight);
  // Retourne les dimensions minimales du conteneur en utilisant
  // minWidth et minHeight ainsi que les dimensions du bord
  // du conteneur (Insets)

        return dim;
    }

    /* Required by LayoutManager. */
    /*
     * This is called when the panel is first displayed,
     * and every time its size changes.
     * Note: You CAN'T assume preferredLayoutSize or
     * minimumLayoutSize will be called -- in the case
     * of applets, at least, they probably won't be.
     */
    public void layoutContainer(Container parent) {
  // Pour tous les composants visibles, definir la position et
  // la taille de chacun des composants en utilisant la methode
  // setBounds

 
    }

    public String toString() {
        String str = "";
        return getClass().getName() + "[vgap=" + vgap + str + "]";
    }
}
