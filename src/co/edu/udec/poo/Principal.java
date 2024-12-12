package co.edu.udec.poo;

import co.edu.udec.poo.views.PrincipalView;

/**
 *
 * @author redhood
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrincipalView view = new PrincipalView();
        view.setExtendedState(PrincipalView.MAXIMIZED_BOTH);
        view.setVisible(true);
    }
    
}
